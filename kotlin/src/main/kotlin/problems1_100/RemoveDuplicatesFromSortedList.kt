package problems1_100

import concepts.SinglyListNode

enum class RemoveDuplicatesFromSortedList {
    DEFAULT {
        override fun deleteDuplicates(head: SinglyListNode?): SinglyListNode? {
            var current = head
            while (current?.next != null) {
                if (current.value == current.next!!.value) {
                    current.next = current.next!!.next
                } else {
                    current = current.next
                }
            }
            return head
        }
    },
    ;

    abstract fun deleteDuplicates(head: SinglyListNode?): SinglyListNode?
}
