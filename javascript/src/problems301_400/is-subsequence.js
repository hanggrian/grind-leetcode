class Problem {
  isSubsequence(s, t) {
    throw new Error(`Not implemented (${s}, ${t}).`);
  }
}

class Default extends Problem {
  isSubsequence(s, t) {
    if (s.length === 0) {
      return true;
    }
    if (t.length === 0) {
      return false;
    }
    let si = 0;
    let ti = 0;
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
