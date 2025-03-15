package problems101_200

enum WordBreak {
    DEFAULT{
        @Override
        boolean wordBreak(String s, List<String> wordDict) {
            boolean[] dp = new boolean[s.length() + 1]
            dp[0] = true
            for (int right = 1; right < dp.length; right++) {
                for (int left = 0; left < right; left++) {
                    if (!(dp[left] && wordDict.contains(s.substring(left, right)))) {
                        continue
                    }
                    dp[right] = true
                    break
                }
            }
            return dp[-1]
        }
    }

    abstract boolean wordBreak(String s, List<String> wordDict)
}
