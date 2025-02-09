package problems101;

import concepts.ListNode;
import concepts.SinglyListNode;
import java.util.HashSet;
import java.util.Set;

public enum LinkedListCycle {
    REMEMBER_VISITS {
        @Override
        public boolean hasCycle(SinglyListNode head) {
            // visited nodes
            Set<ListNode<?>> visits = new HashSet<>();
            for (ListNode<?> node : head) {
                if (!visits.add(node)) {
                    return true;
                }
            }
            return false;
        }
    },
    FAST_SLOW_POINTERS {
        @Override
        public boolean hasCycle(SinglyListNode head) {
            if (head == null || !head.hasNext()) {
                return false;
            }
            SinglyListNode slow = head.next;
            SinglyListNode fast = head.next.next;
            while (fast != null && fast.hasNext() && slow != fast) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow == fast;
        }
    };

    public abstract boolean hasCycle(SinglyListNode head);
}
