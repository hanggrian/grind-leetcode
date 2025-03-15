class Problem {
  minWindow(s, t) {
    throw new Error(`Not implemented (${s}, ${t}).`);
  }
}

class Default extends Problem {
  minWindow(s, t) {
    if (t.length > s.length) {
      return '';
    }

    const sMap = {};
    const tMap = {};
    for (const c of t) {
      tMap[c] = (tMap[c] || 0) + 1;
    }

    let left = 0;
    let right = 0;
    let result = '';
    while (right < s.length) {
      let c = s[right];
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

  getMinLength(s1, s2) {
    return s1 === '' || s1.length > s2.length
        ? s2
        : s1;
  }

  contains(sMap, tMap) {
    for (let key in tMap) {
      if ((sMap[key] || 0) < tMap[key]) {
        return false;
      }
    }
    return true;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
