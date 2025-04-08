package problems301_400

import concepts.SinglyListNode

enum OddEvenLinkedList {
    DEFAULT{
        @Override
        SinglyListNode oddEvenList(SinglyListNode head) {
            if (head == null) {
                return null
            }

            var odd = head
            var even = head.next
            var evenHead = even

            while (even && even.next) {
                odd.next = even.next
                odd = odd.next
                even.next = odd.next
                even = even.next
            }

            odd.next = evenHead
            return head
        }
    }

    abstract SinglyListNode oddEvenList(SinglyListNode head)
}
