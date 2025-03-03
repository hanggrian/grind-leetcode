class Problem {
  reverse(x: number): number {
    throw new Error(`'Not implemented (${x}).`);
  }
}

class Default extends Problem {
  reverse(x: number): number {
    let negate = false;
    let s = x.toString();
    if (s[0] === '-') {
      s = s.slice(1);
      negate = true;
    }

    if (negate) {
      return -parseInt(s.split('').reverse().join(''));
    }
    return parseInt(s.split('').reverse().join(''));
  }
}

export const SOLUTIONS = [new Default()];
