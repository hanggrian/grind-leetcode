package problems101_200;

import concepts.SinglyListNode;

enum IntersectionOfTwoLinkedLists {
    DEFAULT {
        @Override
        SinglyListNode getIntersectionNode(SinglyListNode headA, SinglyListNode headB) {
            SinglyListNode nodeA = headA;
            SinglyListNode nodeB = headB;
            while (nodeA != nodeB) {
                nodeA = nodeA != null ? nodeA.next : headB;
                nodeB = nodeB != null ? nodeB.next : headA;
            }
            return nodeA;
        }
    };

    abstract SinglyListNode getIntersectionNode(SinglyListNode headA, SinglyListNode headB);
}
