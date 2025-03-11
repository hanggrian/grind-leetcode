class Problem {
  isPalindrome(x: number): boolean {
    throw new Error(`Not implemented (${x}).`);
  }
}

class ReverseString extends Problem {
  isPalindrome(x: number): boolean {
    const s = x.toString();
    return s === s.split('').reverse().join('');
  }
}

class CompareHalfString extends Problem {
  isPalindrome(x: number): boolean {
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
