class Problem {
  wordBreak(s: string, wordDict: string[]): string[] {
    throw new Error(`Not implemented (${s}, ${wordDict}).`);
  }
}

class Default extends Problem {
  wordBreak(s: string, wordDict: string[]): string[] {
    return this.recursiveWordBreak(s, wordDict, new Map<string, string[]>());
  }

  recursiveWordBreak(s: string, wordDict: string[], map: Map<string, string[]>): string[] {
    if (s in map) {
      return map[s];
    }
    let result = [];
    for (let word of wordDict) {
      if (!s.startsWith(word)) {
        continue;
      }
      let next = s.slice(word.length);
      if (next.length === 0) {
        result.push(word);
        continue;
      }
      for (let sub of this.recursiveWordBreak(next, wordDict, map)) {
        result.push(word + ' ' + sub);
      }
    }
    map[s] = result;
    return result;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
