package problems301_400

import concepts.SinglyListNode

enum class OddEvenLinkedList {
    DEFAULT {
        override fun oddEvenList(head: SinglyListNode?): SinglyListNode? {
            if (head == null) {
                return null
            }

            var odd: SinglyListNode = head
            var even = head.next
            val evenHead = even

            while (even?.next != null) {
                odd.next = even.next
                odd = odd.next!!
                even.next = odd.next
                even = even.next
            }

            odd.next = evenHead
            return head
        }
    },
    ;

    abstract fun oddEvenList(head: SinglyListNode?): SinglyListNode?
}
