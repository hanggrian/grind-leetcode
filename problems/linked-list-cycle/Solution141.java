import java.util.HashSet;

public class Solution141 {
  public static class RememberVisits {
    public static boolean hasCycle(SinglyListNode head) {
      // visited nodes
      final var visits = new HashSet<SinglyListNode>();

      for (var node : head) {
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
      var slow = head.getNext();
      var fast = head.getNext().getNext();
      while (fast != null && fast.hasNext() && slow != fast) {
        slow = slow.getNext();
        fast = fast.getNext().getNext();
      }
      return slow == fast;
    }
  };
}
