package problems1;

import concepts.SinglyListNode;

public enum RemoveNthNodeFromEndOfList {
    DEFAULT {
        @Override
        public SinglyListNode removeNthFromEnd(SinglyListNode head, int n) {
            if (head.next == null && n == 1) {
                return null;
            }
            SinglyListNode root = new SinglyListNode(0, head);
            SinglyListNode left = root;
            SinglyListNode right = root;
            for (int i = 0; i < n; i++) {
                left = left.next;
            }
            while (left.next != null) {
                left = left.next;
                right = right.next;
            }
            right.next = right.next.next;
            return root.next;
        }
    };

    public abstract SinglyListNode removeNthFromEnd(SinglyListNode head, int n);
}
