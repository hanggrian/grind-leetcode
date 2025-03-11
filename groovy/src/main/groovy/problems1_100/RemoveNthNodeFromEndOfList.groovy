package problems1_100

import concepts.SinglyListNode

enum RemoveNthNodeFromEndOfList {
    DEFAULT{
        @Override
        SinglyListNode removeNthFromEnd(SinglyListNode head, int n) {
            if (head.next == null && n == 1) {
                return null
            }
            var root = new SinglyListNode(0, head)
            var left = root
            var right = root
            for (var i = 0; i < n; i++) {
                left = left.next
            }
            while (left.next != null) {
                left = left.next
                right = right.next
            }
            right.next = right.next.next
            return root.next
        }
    }

    abstract SinglyListNode removeNthFromEnd(SinglyListNode head, int n)
}
