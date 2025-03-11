package problems101_200

enum BestTimeToBuyAndSellStock {
    DEFAULT {
        @Override
        int maxProfit(int[] prices) {
            var minPrice = Integer.MAX_VALUE
            var maxProfit = 0
            for (var price : prices) {
                if (price < minPrice) {
                    minPrice = price
                    continue
                }
                var profit = price - minPrice
                maxProfit = Math.max(profit, maxProfit)
            }
            return maxProfit
        }
    }

    abstract int maxProfit(int[] prices)
}
