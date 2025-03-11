package problems101_200;

import concepts.SinglyListNode;

enum ReorderList {
    DEFAULT {
        @Override
        void reorderList(SinglyListNode head) {
            SinglyListNode mid = getMid(head);
            SinglyListNode right = reverse(mid);
            mid.next = null;
            SinglyListNode left = head;

            SinglyListNode current = new SinglyListNode();
            boolean flag = true;
            while (left != null && right != null) {
                if (flag) {
                    current.next = left;
                    left = left.next;
                } else {
                    current.next = right;
                    right = right.next;
                }
                current = current.next;
                flag = !flag;
            }
        }

        SinglyListNode reverse(SinglyListNode node) {
            SinglyListNode previous = null;
            SinglyListNode current = node;
            while (current != null) {
                SinglyListNode temp = current.next;
                current.next = previous;
                previous = current;
                current = temp;
            }
            return previous;
        }

        SinglyListNode getMid(SinglyListNode node) {
            SinglyListNode slow = node;
            SinglyListNode fast = node;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    };

    abstract void reorderList(SinglyListNode head);
}
