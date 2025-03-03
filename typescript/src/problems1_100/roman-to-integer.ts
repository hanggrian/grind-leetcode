class Problem {
  romanToInt(s: string): number {
    throw new Error(`'Not implemented (${s}).`);
  }
}

class Default extends Problem {
  ROMANS = {
    'I': 1,
    'V': 5,
    'X': 10,
    'L': 50,
    'C': 100,
    'D': 500,
    'M': 1000,
  };

  romanToInt(s: string): number {
    let result = 0;
    for (let i = 0; i < s.length; i++) {
      let c = s[i];
      if (i > 0 && this.ROMANS[c] > this.ROMANS[s[i - 1]]) {
        result += this.ROMANS[c] - 2 * this.ROMANS[s[i - 1]];
      } else {
        result += this.ROMANS[c];
      }
    }
    return result;
  }
}

export const SOLUTIONS = [new Default()];
