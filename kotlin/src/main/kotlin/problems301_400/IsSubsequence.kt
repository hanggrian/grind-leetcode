package problems301_400

enum class IsSubsequence {
    DEFAULT {
        override fun isSubsequence(s: String, t: String): Boolean {
            if (s.isEmpty()) {
                return true
            }
            if (t.isEmpty()) {
                return false
            }
            var si = 0
            var ti = 0
            while (ti < t.length) {
                if (s[si] == t[ti]) {
                    si++
                    if (si == s.length) {
                        return true
                    }
                }
                ti++
            }
            return false
        }
    },
    ;

    abstract fun isSubsequence(s: String, t: String): Boolean
}
