class Problem {
  isUgly(n) {
    throw new Error(`Not implemented (${n}).`);
  }
}

class Default extends Problem {
  isUgly(n) {
    if (n <= 0) {
      return false;
    }
    if (n === 1) {
      return true;
    }
    while (n % 2 === 0) {
      n /= 2;
    }
    while (n % 3 === 0) {
      n /= 3;
    }
    while (n % 5 === 0) {
      n /= 5;
    }
    return n === 1;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
