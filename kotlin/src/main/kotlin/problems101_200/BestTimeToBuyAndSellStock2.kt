package problems101_200

enum class BestTimeToBuyAndSellStock2 {
    DEFAULT {
        override fun maxProfit(prices: IntArray): Int {
            var profit = 0
            var hold = false
            for (i in prices.indices) {
                if (i != prices.size - 1 && prices[i + 1] > prices[i]) {
                    if (!hold) {
                        hold = true
                        profit -= prices[i]
                    }
                    continue
                }
                if (!hold) {
                    continue
                }
                hold = false
                profit += prices[i]
            }
            return profit
        }
    },
    ;

    abstract fun maxProfit(prices: IntArray): Int
}
