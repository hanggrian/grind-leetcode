package problems1_100

import concepts.SinglyListNode

enum RotateList {
    DEFAULT{
        @Override
        SinglyListNode rotateRight(SinglyListNode head, int k) {
            if (!head || k == 0) {
                return head
            }
            var root = new SinglyListNode(0, head)

            // move left pointer, resetting if reached end
            var left = root
            for (var i = 0; i < k; i++) {
                left = left.next ?: root.next
            }

            // get n-th from last, keeping previous node
            var right = root
            var previousRight = null
            while (left) {
                left = left.next
                var nextRight = right.next
                previousRight = right
                right = nextRight
            }

            // sever middle, set last of right to start of left
            previousRight.next = null
            var lastRight = right
            while (lastRight.next) {
                lastRight = lastRight.next
            }
            lastRight.next = root.next

            return right
        }
    }

    abstract SinglyListNode rotateRight(SinglyListNode head, int k)
}
