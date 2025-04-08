class Problem {
  wordBreak(s: string, wordDict: string[]): boolean {
    throw new Error(`Not implemented (${s}, ${wordDict}).`);
  }
}

class Default extends Problem {
  wordBreak(s: string, wordDict: string[]): boolean {
    const dp: boolean[] = new Array(s.length + 1).fill(false);
    dp[0] = true;
    for (let right = 1; right < dp.length; right++) {
      for (let left = 0; left < right; left++) {
        if (!dp[left] || !wordDict.includes(s.slice(left, right))) {
          continue;
        }
        dp[right] = true;
        break;
      }
    }
    return dp[dp.length - 1];
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
