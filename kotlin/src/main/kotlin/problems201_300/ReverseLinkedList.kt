package problems201_300

import concepts.SinglyListNode

enum class ReverseLinkedList {
    DEFAULT {
        override fun reverseList(head: SinglyListNode?): SinglyListNode? {
            var previous: SinglyListNode? = null
            var current = head
            while (current != null) {
                val next = current.next
                current.next = previous
                previous = current
                current = next
            }
            return previous
        }
    },
    ;

    abstract fun reverseList(head: SinglyListNode?): SinglyListNode?
}
