import java.util.HashSet;
import java.util.Set;

public class Solution141 {
  public static class RememberVisits {
    public static boolean hasCycle(SinglyListNode head) {
      // visited nodes
      final Set<SinglyListNode> visits = new HashSet<>();

      for (SinglyListNode node : head) {
        if (!visits.add(node)) {
          return true;
        }
      }
      return false;
    }
  }

  public static class FastSlowPointers {
    public static boolean hasCycle(SinglyListNode head) {
      if (head == null || !head.hasNext()) {
        return false;
      }
      SinglyListNode slow = head.getNext();
      SinglyListNode fast = head.getNext().getNext();
      while (fast != null && fast.hasNext() && slow != fast) {
        slow = slow.getNext();
        fast = fast.getNext().getNext();
      }
      return slow == fast;
    }
  };
}
