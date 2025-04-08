package problems201_300;

enum ValidAnagram {
    DEFAULT {
        @Override
        boolean isAnagram(String s, String t) {
            if (t.length() > s.length()) {
                return false;
            }
            int[] map = new int[128];
            for (char c : s.toCharArray()) {
                map[c]++;
            }
            for (char c : t.toCharArray()) {
                map[c]--;
            }
            for (int i : map) {
                if (i > 0) {
                    return false;
                }
            }
            return true;
        }
    };

    abstract boolean isAnagram(String s, String t);
}
