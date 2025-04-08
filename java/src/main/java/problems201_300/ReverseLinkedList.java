package problems201_300;

import concepts.SinglyListNode;

enum ReverseLinkedList {
    DEFAULT {
        @Override
        SinglyListNode reverseList(SinglyListNode head) {
            SinglyListNode previous = null;
            SinglyListNode current = head;
            while (current != null) {
                SinglyListNode next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }
            return previous;
        }
    };

    abstract SinglyListNode reverseList(SinglyListNode head);
}
