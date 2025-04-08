class Problem {
  minWindow(s: string, t: string): string {
    throw new Error(`Not implemented (${s}, ${t}).`);
  }
}

class Default extends Problem {
  minWindow(s: string, t: string): string {
    if (t.length > s.length) {
      return '';
    }

    const sMap = {};
    const tMap = {};
    for (const c of t) {
      tMap[c] = (tMap[c] || 0) + 1;
    }

    let left: number = 0;
    let right: number = 0;
    let result: string = '';
    while (right < s.length) {
      const c: string = s[right];
      sMap[c] = (sMap[c] || 0) + 1;
      right++;
      while (left <= right && this.contains(sMap, tMap)) {
        result = this.getMinLength(result, s.slice(left, right));
        sMap[s[left]]--;
        left++;
      }
    }
    return result;
  }

  getMinLength(s1: string, s2: string): string {
    return s1 === '' || s1.length > s2.length
        ? s2
        : s1;
  }

  contains(sMap: object, tMap: object): boolean {
    for (const key in tMap) {
      if ((sMap[key] || 0) < tMap[key]) {
        return false;
      }
    }
    return true;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
