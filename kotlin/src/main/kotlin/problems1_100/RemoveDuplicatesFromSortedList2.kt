package problems1_100

import concepts.SinglyListNode

enum class RemoveDuplicatesFromSortedList2 {
    DEFAULT {
        override fun deleteDuplicates(head: SinglyListNode?): SinglyListNode? {
            val root = SinglyListNode(-101, head)
            var previous: SinglyListNode? = root
            var current = head
            while (current != null) {
                if (current.next?.`val` == current.`val`) {
                    while (current!!.next?.`val` == current.`val`) {
                        current = current.next
                    }
                    previous!!.next = current.next
                } else {
                    previous = previous!!.next
                }
                current = current.next
            }
            return root.next
        }
    },
    ;

    abstract fun deleteDuplicates(head: SinglyListNode?): SinglyListNode?
}
