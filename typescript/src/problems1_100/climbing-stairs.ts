class Problem {
  climbStairs(n: number): number {
    throw new Error(`Not implemented (${n}).`);
  }
}

class BruteForce extends Problem {
  climbStairs(n: number): number {
    if (n === 0 || n === 1) {
      return 1;
    }
    return this.climbStairs(n - 1) + this.climbStairs(n - 2);
  }
}

class DynamicProgramming extends Problem {
  climbStairs(n: number) {
    if (n <= 2) {
      return n;
    }
    const results: number[] = new Array<number>(n);
    results[0] = 1;
    results[1] = 2;
    for (let i = 2; i < n; i++) {
      results[i] = results[i - 1] + results[i - 2];
    }
    return results[n - 1];
  }
}

const SOLUTIONS = [new BruteForce(), new DynamicProgramming()];
export default SOLUTIONS;
