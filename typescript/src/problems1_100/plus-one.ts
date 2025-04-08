class Problem {
  plusOne(digits: number[]): number[] {
    throw new Error(`Not implemented (${digits}).`);
  }
}

class Default extends Problem {
  plusOne(digits: number[]): number[] {
    let carry: number = 0;
    for (let i = digits.length - 1; i >= 0; i--) {
      if (i === digits.length - 1) {
        digits[i] = digits[i] + 1;
      }
      digits[i] = digits[i] + carry;
      carry = Math.floor(digits[i] / 10);
      digits[i] = digits[i] % 10;
    }
    if (carry === 1) {
      const digits2: number[] = new Array<number>(digits.length + 1);
      digits2[0] = 1;
      for (let j = 0; j < digits.length; j++) {
        digits2[j + 1] = digits[j];
      }
      return digits2;
    }
    return digits;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
