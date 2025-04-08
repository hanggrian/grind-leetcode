package problems201_300;

import concepts.SinglyListNode;

enum DeleteNodeInALinkedList {
    DEFAULT {
        @Override
        void deleteNode(SinglyListNode node) {
            if (node == null) {
                return;
            }
            SinglyListNode next = node.next;
            node.val = next.val;
            node.next = next.next;
        }
    };

    abstract void deleteNode(SinglyListNode node);
}
