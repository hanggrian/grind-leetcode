package problems301_400;

enum RansomNote {
    DEFAULT {
        @Override
        boolean canConstruct(String ransomNote, String magazine) {
            int[] map = new int[128];
            for (char c : ransomNote.toCharArray()) {
                map[c]++;
            }
            for (char c : magazine.toCharArray()) {
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

    abstract boolean canConstruct(String ransomNote, String magazine);
}
