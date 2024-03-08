public class Solution9 {
  public static class ReverseString {
    public static boolean isPalindrome(int x) {
      final String s = String.valueOf(x);
      return s.contentEquals(new StringBuilder(s).reverse());
    }
  }

  public static class CompareHalfString {
    public static boolean isPalindrome(int x) {
      final String s = String.valueOf(x);
      int start = 0;
      int end = s.length() - 1;
      while (start < end) {
        if (s.charAt(start++) != s.charAt(end--)) {
          return false;
        }
      }
      return true;
    }
  }
}
