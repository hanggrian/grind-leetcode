package problems201_300

import concepts.SinglyListNode

enum class RemoveLinkedListElements {
    DEFAULT {
        override fun removeElements(head: SinglyListNode?, `val`: Int): SinglyListNode? {
            val newHead = SinglyListNode()
            var currentNew = newHead

            var current = head
            while (current != null) {
                if (current.`val` != `val`) {
                    currentNew.next = SinglyListNode(current.`val`)
                    currentNew = currentNew.next!!
                }
                current = current.next
            }
            return newHead.next
        }
    },
    ;

    abstract fun removeElements(head: SinglyListNode?, `val`: Int): SinglyListNode?
}
