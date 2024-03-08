public class Solution9 {
  public static class ReverseString {
    public static boolean isPalindrome(int x) {
      final var s = String.valueOf(x);
      return s.contentEquals(new StringBuilder(s).reverse());
    }
  }

  public static class CompareHalfString {
    public static boolean isPalindrome(int x) {
      final var s = String.valueOf(x);
      var start = 0;
      var end = s.length() - 1;
      while (start < end) {
        if (s.charAt(start++) != s.charAt(end--)) {
          return false;
        }
      }
      return true;
    }
  }
}
