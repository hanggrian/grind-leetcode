class Problem {
  isPalindrome(s: string): boolean {
    throw new Error(`Not implemented (${s}).`);
  }
}

class BruteForce extends Problem {
  isPalindrome(s: string): boolean {
    let builder = '';
    for (const c of s) {
      if (/[a-zA-Z0-9]/.test(c)) {
        builder += c;
      }
    }
    s = builder.toLowerCase();
    return s === s.split('').reverse().join('');
  }
}

class CompareHalfString extends Problem {
  isPalindrome(s: string): boolean {
    let builder = '';
    for (const c of s) {
      if (/[a-zA-Z0-9]/.test(c)) {
        builder += c;
      }
    }
    s = builder;
    let start = 0;
    let end = s.length - 1;
    while (start < end) {
      if (s[start++].toLowerCase() !==
          s[end--].toLowerCase()) {
        return false;
      }
    }
    return true;
  }
}

const SOLUTIONS = [new BruteForce(), new CompareHalfString()];
export default SOLUTIONS;
