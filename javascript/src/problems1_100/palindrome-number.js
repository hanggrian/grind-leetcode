class Problem {
  isPalindrome(x) {
    throw new Error(`'Not implemented (${x}).`);
  }
}

class ReverseString extends Problem {
  isPalindrome(x) {
    return x.toString() === x.toString().split('').reverse().join('');
  }
}

class CompareHalfString extends Problem {
  isPalindrome(x) {
    let s = x.toString();
    let start = 0;
    let end = s.length - 1;
    while (start < end) {
      if (s[start++] !== s[end--]) {
        return false;
      }
    }
    return true;
  }
}

export const SOLUTIONS = [new ReverseString(), new CompareHalfString()];
