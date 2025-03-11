package problems101_200

import kotlin.math.max

enum class BestTimeToBuyAndSellStock {
    DEFAULT {
        override fun maxProfit(prices: IntArray): Int {
            var minPrice = Int.MAX_VALUE
            var maxProfit = 0
            for (price in prices) {
                if (price < minPrice) {
                    minPrice = price
                    continue
                }
                val profit = price - minPrice
                maxProfit = max(profit, maxProfit)
            }
            return maxProfit
        }
    },
    ;

    abstract fun maxProfit(prices: IntArray): Int
}
