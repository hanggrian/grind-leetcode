package problems101_200

import concepts.SinglyListNode

enum LinkedListCycle {
    REMEMBER_VISITS{
        @Override
        boolean hasCycle(SinglyListNode head) {
            // visited nodes
            Set<SinglyListNode> visits = []
            for (var node : head) {
                if (!visits.add(node)) {
                    return true
                }
            }
            return false
        }
    },
    FAST_SLOW_POINTERS{
        @Override
        boolean hasCycle(SinglyListNode head) {
            if (!head || !head.next) {
                return false
            }
            var slow = head.next
            var fast = head.next.next
            while (fast && fast.next && slow != fast) {
                slow = slow.next
                fast = fast.next.next
            }
            return slow == fast
        }
    }

    abstract boolean hasCycle(SinglyListNode head)
}
