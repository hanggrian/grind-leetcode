package problems101_200

enum WordBreak2 {
    DEFAULT{
        @Override
        List<String> wordBreak(String s, List<String> wordDict) {
            return recursiveWordBreak(s, wordDict, [:])
        }

        List<String> recursiveWordBreak(
            String s,
            List<String> wordDict,
            Map<String, List<String>> map
        ) {
            if (map.containsKey(s)) {
                return map.get(s)
            }
            ArrayList<String> result = []
            for (var word : wordDict) {
                if (!s.startsWith(word)) {
                    continue
                }
                var next = s.substring(word.length())
                if (next.isEmpty()) {
                    result.add(word)
                    continue
                }
                for (var sub : recursiveWordBreak(next, wordDict, map)) {
                    result.add(word + " " + sub)
                }
            }
            map.put(s, result)
            return result
        }
    }

    abstract List<String> wordBreak(String s, List<String> wordDict)
}
