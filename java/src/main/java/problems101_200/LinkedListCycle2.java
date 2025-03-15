package problems101_200;

import concepts.SinglyListNode;
import java.util.HashSet;
import java.util.Set;

enum LinkedListCycle2 {
    REMEMBER_VISITS {
        @Override
        SinglyListNode detectCycle(SinglyListNode head) {
            // visited nodes
            Set<SinglyListNode> visits = new HashSet<>();
            SinglyListNode current = head;
            for (SinglyListNode node : head) {
                if (!visits.add(node)) {
                    return current;
                }
                current = current.next;
            }
            return current;
        }
    },
    FAST_SLOW_POINTERS {
        @Override
        SinglyListNode detectCycle(SinglyListNode head) {
            if (head == null || head.next == null) {
                return null;
            }
            SinglyListNode slow = head.next;
            SinglyListNode fast = head.next.next;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    break;
                }
            }

            if (slow == null || slow.next == null) {
                return null;
            }
            SinglyListNode left = head;
            SinglyListNode right = slow;
            while (left != right) {
                left = left.next;
                right = right.next;
            }
            return left;
        }
    };

    abstract SinglyListNode detectCycle(SinglyListNode head);
}
