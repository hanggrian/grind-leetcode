package problems1_100;

import concepts.SinglyListNode;

enum RemoveDuplicatesFromSortedList {
    DEFAULT {
        @Override
        SinglyListNode deleteDuplicates(SinglyListNode head) {
            SinglyListNode current = head;
            while (current != null && current.next != null) {
                if (current.val == current.next.val) {
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }
            return head;
        }
    };

    abstract SinglyListNode deleteDuplicates(SinglyListNode head);
}
