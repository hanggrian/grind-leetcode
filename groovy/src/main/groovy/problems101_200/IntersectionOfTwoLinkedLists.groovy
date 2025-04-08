package problems101_200

import concepts.SinglyListNode

enum IntersectionOfTwoLinkedLists {
    DEFAULT{
        @Override
        SinglyListNode getIntersectionNode(SinglyListNode headA, SinglyListNode headB) {
            var nodeA = headA
            var nodeB = headB
            while (nodeA != nodeB) {
                nodeA = nodeA ? nodeA.next : headB
                nodeB = nodeB ? nodeB.next : headA
            }
            return nodeA
        }
    }

    abstract SinglyListNode getIntersectionNode(SinglyListNode headA, SinglyListNode headB)
}
