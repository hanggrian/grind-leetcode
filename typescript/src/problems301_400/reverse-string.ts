class Problem {
  reverseString(s: string[]) {
    throw new Error(`Not implemented (${s}).`);
  }
}

class Default extends Problem {
  reverseString(s: string[]) {
    for (let left = 0; left < Math.floor(s.length / 2); left++) {
      const right: number = s.length - 1 - left;
      const temp: string = s[left];
      s[left] = s[right];
      s[right] = temp;
    }
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
