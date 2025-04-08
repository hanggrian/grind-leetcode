package problems1_100;

import concepts.SinglyListNode;

enum MergeTwoSortedLists {
    DEFAULT {
        @Override
        SinglyListNode mergeTwoLists(SinglyListNode l1, SinglyListNode l2) {
            if (l1 == null) {
                return l2;
            }
            if (l2 == null) {
                return l1;
            }
            SinglyListNode root = new SinglyListNode();
            SinglyListNode current = root;

            // when both items are there
            while (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    current.next = new SinglyListNode(l1.val);
                    l1 = l1.next;
                } else {
                    current.next = new SinglyListNode(l2.val);
                    l2 = l2.next;
                }
                current = current.next;
            }

            // remaining
            current.next = l1 != null ? l1 : l2;
            return root.next;
        }
    };

    abstract SinglyListNode mergeTwoLists(SinglyListNode l1, SinglyListNode l2);
}
