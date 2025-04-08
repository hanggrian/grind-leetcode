package problems101_200

import concepts.SinglyListNode

enum class IntersectionOfTwoLinkedLists {
    DEFAULT {
        override fun getIntersectionNode(
            headA: SinglyListNode?,
            headB: SinglyListNode?,
        ): SinglyListNode? {
            var nodeA = headA
            var nodeB = headB
            while (nodeA !== nodeB) {
                nodeA = if (nodeA != null) nodeA.next else headB
                nodeB = if (nodeB != null) nodeB.next else headA
            }
            return nodeA
        }
    },
    ;

    abstract fun getIntersectionNode(
        headA: SinglyListNode?,
        headB: SinglyListNode?,
    ): SinglyListNode?
}
