class Problem {
  isSubsequence(s: string, t: string): boolean {
    throw new Error(`Not implemented (${s}, ${t}).`);
  }
}

class Default extends Problem {
  isSubsequence(s: string, t: string): boolean {
    if (s.length === 0) {
      return true;
    }
    if (t.length === 0) {
      return false;
    }
    let si: number = 0;
    let ti: number = 0;
    while (ti < t.length) {
      if (s[si] === t[ti]) {
        si++;
        if (si === s.length) {
          return true;
        }
      }
      ti++;
    }
    return false;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
