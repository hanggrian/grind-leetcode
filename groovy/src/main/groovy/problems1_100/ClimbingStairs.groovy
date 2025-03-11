package problems1_100

enum ClimbingStairs {
    BRUTE_FORCE {
        @Override
        int climbStairs(int n) {
            if (n == 0 || n == 1) {
                return 1
            }
            return climbStairs(n - 1) + climbStairs(n - 2)
        }
    },
    DYNAMIC_PROGRAMMING {
        @Override
        int climbStairs(int n) {
            if (n <= 2) {
                return n
            }
            var results = new int[n]
            results[0] = 1
            results[1] = 2
            for (var i = 2; i < n; i++) {
                results[i] = results[i - 1] + results[i - 2]
            }
            return results[n - 1]
        }
    }

    abstract int climbStairs(int n)
}
