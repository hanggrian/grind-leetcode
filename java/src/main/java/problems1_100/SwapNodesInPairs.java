package problems1_100;

import concepts.SinglyListNode;

enum SwapNodesInPairs {
    DEFAULT {
        @Override
        SinglyListNode swapPairs(SinglyListNode head) {
            SinglyListNode root = new SinglyListNode(0, head);
            SinglyListNode current = root;
            while (current.next != null && current.next.next != null) {
                SinglyListNode node1 = current.next;
                SinglyListNode node2 = current.next.next;
                node1.next = node2.next;
                current.next = node2;
                current.next.next = node1;
                current = current.next.next;
            }
            return root.next;
        }
    };

    abstract SinglyListNode swapPairs(SinglyListNode head);
}
