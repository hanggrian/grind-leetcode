package problems301_400

enum IsSubsequence {
    DEFAULT{
        @Override
        boolean isSubsequence(String s, String t) {
            if (s.isEmpty()) {
                return true
            }
            if (t.isEmpty()) {
                return false
            }
            var si = 0
            var ti = 0
            while (ti < t.length()) {
                if (s.charAt(si) == t.charAt(ti)) {
                    si++
                    if (si == s.length()) {
                        return true
                    }
                }
                ti++
            }
            return false
        }
    }

    abstract boolean isSubsequence(String s, String t)
}
