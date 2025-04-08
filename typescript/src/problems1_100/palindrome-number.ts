class Problem {
  isPalindrome(x: number): boolean {
    throw new Error(`Not implemented (${x}).`);
  }
}

class ReverseString extends Problem {
  isPalindrome(x: number): boolean {
    const s: string = x.toString();
    return s === s.split('').reverse().join('');
  }
}

class CompareHalfString extends Problem {
  isPalindrome(x: number): boolean {
    const s: string = x.toString();
    let start: number = 0;
    let end: number = s.length - 1;
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
