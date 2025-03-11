package problems1_100;

import concepts.SinglyListNode;

enum RemoveDuplicatesFromSortedList2 {
    DEFAULT {
        @Override
        SinglyListNode deleteDuplicates(SinglyListNode head) {
            SinglyListNode root = new SinglyListNode(-101, head);
            SinglyListNode previous = root;
            SinglyListNode current = head;
            while (current != null) {
                if (current.next != null && current.value == current.next.value) {
                    while (current.next != null && current.value == current.next.value) {
                        current = current.next;
                    }
                    previous.next = current.next;
                } else {
                    previous = previous.next;
                }
                current = current.next;
            }
            return root.next;
        }
    };

    abstract SinglyListNode deleteDuplicates(SinglyListNode head);
}
