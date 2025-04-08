class Problem {
  firstUniqChar(s: string): number {
    throw new Error(`Not implemented (${s}).`);
  }
}

class Default extends Problem {
  firstUniqChar(s: string): number {
    const map: Map<string, number> = new Map();
    for (let i = 0; i < s.length; i++) {
      map.set(s[i], (map.get(s[i]) || 0) + 1);
    }
    for (let i = 0; i < s.length; i++) {
      if (map.get(s[i]) === 1) {
        return i;
      }
    }
    return -1;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
