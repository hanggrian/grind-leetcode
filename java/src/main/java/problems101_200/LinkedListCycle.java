package problems101_200;

import concepts.SinglyListNode;
import java.util.HashSet;
import java.util.Set;

enum LinkedListCycle {
    REMEMBER_VISITS {
        @Override
        boolean hasCycle(SinglyListNode head) {
            // visited nodes
            Set<SinglyListNode> visits = new HashSet<>();
            for (SinglyListNode node : head) {
                if (!visits.add(node)) {
                    return true;
                }
            }
            return false;
        }
    },
    FAST_SLOW_POINTERS {
        @Override
        boolean hasCycle(SinglyListNode head) {
            if (head == null || head.next == null) {
                return false;
            }
            SinglyListNode slow = head.next;
            SinglyListNode fast = head.next.next;
            while (fast != null && fast.next != null && slow != fast) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow == fast;
        }
    };

    abstract boolean hasCycle(SinglyListNode head);
}
