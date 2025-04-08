class Problem {
  reverseString(s) {
    throw new Error(`Not implemented (${s}).`);
  }
}

class Default extends Problem {
  reverseString(s) {
    for (let left = 0; left < Math.floor(s.length / 2); left++) {
      const right = s.length - 1 - left;
      const temp = s[left];
      s[left] = s[right];
      s[right] = temp;
    }
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
