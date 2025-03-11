class Problem {
  isPalindrome(x) {
    throw new Error(`Not implemented (${x}).`);
  }
}

class ReverseString extends Problem {
  isPalindrome(x) {
    const s = x.toString();
    return s.toString() === s.toString().split('').reverse().join('');
  }
}

class CompareHalfString extends Problem {
  isPalindrome(x) {
    const s = x.toString();
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

const SOLUTIONS = [new ReverseString(), new CompareHalfString()];
export default SOLUTIONS;
