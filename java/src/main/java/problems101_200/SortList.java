package problems101_200;

import concepts.SinglyListNode;

enum SortList {
    DEFAULT {
        @Override
        SinglyListNode sortList(SinglyListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            SinglyListNode mid = split(head);
            return merge(
                sortList(head),
                sortList(mid)
            );
        }

        SinglyListNode merge(SinglyListNode node1, SinglyListNode node2) {
            SinglyListNode root = new SinglyListNode();
            SinglyListNode current = root;
            while (node1 != null && node2 != null) {
                if (node1.val < node2.val) {
                    current.next = node1;
                    node1 = node1.next;
                } else {
                    current.next = node2;
                    node2 = node2.next;
                }
                current = current.next;
            }
            if (node1 != null) {
                current.next = node1;
            } else if (node2 != null) {
                current.next = node2;
            }
            return root.next;
        }

        SinglyListNode split(SinglyListNode node) {
            SinglyListNode slowPrev = null;
            SinglyListNode slow = node;
            SinglyListNode fast = node;
            while (fast != null && fast.next != null) {
                slowPrev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            slowPrev.next = null;
            return slow;
        }
    };

    abstract SinglyListNode sortList(SinglyListNode head);
}
