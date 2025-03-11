package problems1_100;

import concepts.SinglyListNode;

enum RotateList {
    DEFAULT {
        @Override
        SinglyListNode rotateRight(SinglyListNode head, int k) {
            if (head == null || k == 0) {
                return head;
            }
            SinglyListNode root = new SinglyListNode(0, head);

            // move left pointer, resetting if reached end
            SinglyListNode left = root;
            for (int i = 0; i < k; i++) {
                left = left.next;
                if (left == null) {
                    left = root.next;
                }
            }

            // get n-th from last, keeping previous node
            SinglyListNode right = root;
            SinglyListNode previousRight = null;
            while (left != null) {
                left = left.next;
                SinglyListNode nextRight = right.next;
                previousRight = right;
                right = nextRight;
            }

            // sever middle, set last of right to start of left
            previousRight.next = null;
            SinglyListNode lastRight = right;
            while (lastRight.next != null) {
                lastRight = lastRight.next;
            }
            lastRight.next = root.next;

            return right;
        }
    };

    abstract SinglyListNode rotateRight(SinglyListNode head, int k);
}
