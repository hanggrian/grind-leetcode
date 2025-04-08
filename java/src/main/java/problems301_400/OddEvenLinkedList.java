package problems301_400;

import concepts.SinglyListNode;

enum OddEvenLinkedList {
    DEFAULT {
        @Override
        SinglyListNode oddEvenList(SinglyListNode head) {
            if (head == null) {
                return null;
            }

            SinglyListNode odd = head;
            SinglyListNode even = head.next;
            SinglyListNode evenHead = even;

            while (even != null && even.next != null) {
                odd.next = even.next;
                odd = odd.next;
                even.next = odd.next;
                even = even.next;
            }

            odd.next = evenHead;
            return head;
        }
    };

    abstract SinglyListNode oddEvenList(SinglyListNode head);
}
