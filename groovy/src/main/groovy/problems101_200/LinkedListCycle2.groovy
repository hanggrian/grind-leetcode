package problems101_200

import concepts.SinglyListNode

enum LinkedListCycle2 {
    REMEMBER_VISITS{
        @Override
        SinglyListNode detectCycle(SinglyListNode head) {
            // visited nodes
            HashSet<SinglyListNode> visits = []
            var current = head
            for (var node : head) {
                if (!visits.add(node)) {
                    return current
                }
                current = current.next
            }
            return current
        }
    },
    FAST_SLOW_POINTERS{
        @Override
        SinglyListNode detectCycle(SinglyListNode head) {
            if (!head || !head.next) {
                return null
            }
            var slow = head.next
            var fast = head.next.next
            while (fast && fast.next) {
                slow = slow.next
                fast = fast.next.next
                if (slow == fast) {
                    break
                }
            }

            if (!slow || !slow.next) {
                return null
            }
            var left = head
            var right = slow
            while (left != right) {
                left = left.next
                right = right.next
            }
            return left
        }
    }

    abstract SinglyListNode detectCycle(SinglyListNode head)
}
