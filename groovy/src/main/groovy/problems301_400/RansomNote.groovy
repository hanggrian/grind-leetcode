package problems301_400

enum RansomNote {
    DEFAULT{
        @Override
        boolean canConstruct(String ransomNote, String magazine) {
            var map = new int[128]
            for (var c : ransomNote.toCharArray()) {
                map[c as int]++
            }
            for (var c : magazine.toCharArray()) {
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

    abstract boolean canConstruct(String ransomNote, String magazine)
}
