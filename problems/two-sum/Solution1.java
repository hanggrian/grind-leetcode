import java.util.HashMap;

public class Solution1 {
  public static class BruteForce {
    public static int[] twoSum(int[] nums, int target) {
      for (var i = 0; i < nums.length; i++) {
        for (var j = i + 1; j < nums.length; j++) {
          if (nums[j] == target - nums[i]) {
            return new int[] {i, j};
          }
        }
      }
      return null;
    }
  }

  public static class SinglePass {
    public static int[] twoSum(int[] nums, int target) {
      // remaining to index mapping
      final var indices = new HashMap<Integer, Integer>();

      for (int i = 0; i < nums.length; i++) {
        final int num = nums[i];
        if (indices.containsKey(num)) {
          return new int[]{indices.get(num), i};
        }
        indices.put(target - num, i);
      }
      return new int[]{-1, -1};
    }
  }
}
