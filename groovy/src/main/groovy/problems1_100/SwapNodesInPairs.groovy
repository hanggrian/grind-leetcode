package problems1_100

import concepts.SinglyListNode

enum SwapNodesInPairs {
    DEFAULT{
        @Override
        SinglyListNode swapPairs(SinglyListNode head) {
            var root = new SinglyListNode(0, head)
            var current = root
            while (current.next && current.next.next) {
                var node1 = current.next
                var node2 = current.next.next
                node1.next = node2.next
                current.next = node2
                current.next.next = node1
                current = current.next.next
            }
            return root.next
        }
    }

    abstract SinglyListNode swapPairs(SinglyListNode head)
}
