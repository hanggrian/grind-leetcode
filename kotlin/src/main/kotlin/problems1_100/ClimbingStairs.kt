package problems1_100

enum class ClimbingStairs {
    BRUTE_FORCE {
        override fun climbStairs(n: Int): Int {
            if (n == 0 || n == 1) {
                return 1
            }
            return climbStairs(n - 1) + climbStairs(n - 2)
        }
    },
    DYNAMIC_PROGRAMMING {
        override fun climbStairs(n: Int): Int {
            if (n <= 2) {
                return n
            }
            val results = IntArray(n)
            results[0] = 1
            results[1] = 2
            for (i in 2 until n) {
                results[i] = results[i - 1] + results[i - 2]
            }
            return results[n - 1]
        }
    },
    ;

    abstract fun climbStairs(n: Int): Int
}
