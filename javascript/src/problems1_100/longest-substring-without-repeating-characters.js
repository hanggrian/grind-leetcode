class Problem {
  lengthOfLongestSubstring(s) {
    throw new Error(`Not implemented (${s}).`);
  }
}

class Default extends Problem {
  lengthOfLongestSubstring(s) {
    if (!s) {
      return 0;
    }
    const characters = new Set();
    let start = 0;
    let end = 0;
    let maxLength = Number.MIN_SAFE_INTEGER;
    while (end < s.length) {
      if (!characters.has(s[end])) {
        characters.add(s[end]);
        end++;
        maxLength = Math.max(maxLength, characters.size);
        continue;
      }
      characters.delete(s[start]);
      start++;
    }
    return maxLength;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
