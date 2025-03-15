class Problem {
  longestPalindrome(s: string): string {
    throw new Error(`Not implemented (${s}).`);
  }
}

class Default extends Problem {
  longestPalindrome(s: string): string {
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
        palindrome = s.slice(start, end + 1);
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
        palindrome = s.slice(start, end + 1);
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

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
