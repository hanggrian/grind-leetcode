class Problem {
  lengthOfLongestSubstring(s: string): number {
    throw new Error(`Not implemented (${s}).`);
  }
}

class Default extends Problem {
  lengthOfLongestSubstring(s: string): number {
    if (!s) {
      return 0;
    }
    const characters: Set<string> = new Set();
    let start: number = 0;
    let end: number = 0;
    let maxLength: number = Number.MIN_SAFE_INTEGER;
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
