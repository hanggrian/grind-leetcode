package problems1_100

import concepts.SinglyListNode

enum ReverseLinkedList2 {
    DEFAULT{
        @Override
        SinglyListNode reverseBetween(SinglyListNode head, int left, int right) {
            if (left == right) {
                return head
            }

            var root = new SinglyListNode(0, head)
            var centerStart = root
            var centerStartPrevious = null
            var centerEnd = root
            for (var i = 0; i < right; i++) {
                if (i < left) {
                    centerStartPrevious = centerStart
                    centerStart = centerStart.next
                }
                centerEnd = centerEnd.next
            }

            var excess = centerEnd.next
            centerStartPrevious.next = null
            centerEnd.next = null

            var current
            if (left == 1) {
                head = reverse(centerStart)
                current = head
            } else {
                current = traverseUntilEnd(head)
                current.next = reverse(centerStart)
            }
            current = traverseUntilEnd(current)
            current.next = excess
            return head
        }

        SinglyListNode traverseUntilEnd(SinglyListNode node) {
            var current = node
            while (current.next) {
                current = current.next
            }
            return current
        }

        SinglyListNode reverse(SinglyListNode node) {
            var current = node
            var previous = null
            while (current) {
                SinglyListNode temp = current.next
                current.next = previous
                previous = current
                current = temp
            }
            return previous
        }
    }

    abstract SinglyListNode reverseBetween(SinglyListNode head, int left, int right)
}
