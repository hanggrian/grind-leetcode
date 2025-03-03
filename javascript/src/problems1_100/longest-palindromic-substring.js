class Problem {
  longestPalindrome(s) {
    throw new Error(`'Not implemented (${s}).`);
  }
}

class Default extends Problem {
  longestPalindrome(s) {
    if (s.length === 1) {
      return s;
    }
    let longestPalindrome = '';
    for (let i = 0; i < s.length; i++) {
      let palindrome;

      // check odd
      let start = i;
      let end = i;
      while (start >= 0 && end < s.length && s[start] === s[end]) {
        palindrome = s.substring(start, end + 1);
        if (palindrome.length > longestPalindrome.length) {
          longestPalindrome = palindrome;
        }
        start--;
        end++;
      }

      // check even
      start = i;
      end = i + 1;
      while (start >= 0 && end < s.length && s[start] === s[end]) {
        palindrome = s.substring(start, end + 1);
        if (palindrome.length > longestPalindrome.length) {
          longestPalindrome = palindrome;
        }
        start--;
        end++;
      }
    }
    return longestPalindrome;
  }
}

export const SOLUTIONS = [new Default()];
