package problems101_200

import concepts.SinglyListNode

enum ReorderList {
    DEFAULT{
        @Override
        void reorderList(SinglyListNode head) {
            var mid = getMid(head)
            var right = reverse(mid)
            mid.next = null
            var left = head

            var current = new SinglyListNode()
            boolean flag = true
            while (left != null && right != null) {
                if (flag) {
                    current.next = left
                    left = left.next
                } else {
                    current.next = right
                    right = right.next
                }
                current = current.next
                flag = !flag
            }
        }

        SinglyListNode reverse(SinglyListNode node) {
            var previous = null
            var current = node
            while (current != null) {
                var temp = current.next
                current.next = previous
                previous = current
                current = temp
            }
            return previous
        }

        SinglyListNode getMid(SinglyListNode node) {
            var slow = node
            var fast = node
            while (fast != null && fast.next != null) {
                slow = slow.next
                fast = fast.next.next
            }
            return slow
        }
    }

    abstract void reorderList(SinglyListNode head)
}
