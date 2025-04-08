package problems301_400

enum FirstUniqueCharacterInAString {
    DEFAULT{
        @Override
        int firstUniqChar(String s) {
            LinkedHashMap<Character, Integer> map = []
            for (var c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1)
            }
            for (var c : map.keySet()) {
                if (map.get(c) == 1) {
                    return s.indexOf(c as int)
                }
            }
            return -1
        }
    }

    abstract int firstUniqChar(String s)
}
