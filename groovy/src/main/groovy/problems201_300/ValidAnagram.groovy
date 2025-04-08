package problems201_300

enum ValidAnagram {
    DEFAULT{
        @Override
        boolean isAnagram(String s, String t) {
            if (t.length() > s.length()) {
                return false
            }
            var map = new int[128]
            for (var c : s.toCharArray()) {
                map[c as int]++
            }
            for (var c : t.toCharArray()) {
                map[c as int]--
            }
            for (var i : map) {
                if (i > 0) {
                    return false
                }
            }
            return true
        }
    }

    abstract boolean isAnagram(String s, String t)
}
