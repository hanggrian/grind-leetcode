class Problem {
  wordBreak(s, wordDict) {
    throw new Error(`Not implemented (${s}, ${wordDict}).`);
  }
}

class Default extends Problem {
  wordBreak(s, wordDict) {
    const dp = new Array(s.length + 1).fill(false);
    dp[0] = true;
    for (let right = 1; right < dp.length; right++) {
      for (let left = 0; left < right; left++) {
        if (!dp[left] || !wordDict.includes(s.substring(left, right))) {
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
