class Problem {
  isAnagram(s, t) {
    throw new Error(`Not implemented (${s}, ${t}).`);
  }
}

class Default extends Problem {
  isAnagram(s, t) {
    if (t.length > s.length) {
      return false;
    }
    const map = new Array(128).fill(0);
    for (let i = 0; i < s.length; i++) {
      map[s.charCodeAt(i)]++;
    }
    for (let i = 0; i < t.length; i++) {
      map[t.charCodeAt(i)]--;
    }
    for (let i = 0; i < map.length; i++) {
      if (map[i] > 0) {
        return false;
      }
    }
    return true;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
