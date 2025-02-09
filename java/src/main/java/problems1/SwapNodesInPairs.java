package problems1;

import concepts.SinglyListNode;

public enum SwapNodesInPairs {
    DEFAULT {
        @Override
        public SinglyListNode swapPairs(SinglyListNode head) {
            SinglyListNode root = new SinglyListNode(0);
            root.next = head;
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

    public abstract SinglyListNode swapPairs(SinglyListNode head);
}
