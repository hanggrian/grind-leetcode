package problems101_200;

enum BestTimeToBuyAndSellStock {
    DEFAULT {
        @Override
        int maxProfit(int[] prices) {
            int minPrice = Integer.MAX_VALUE;
            int maxProfit = 0;
            for (int price : prices) {
                if (price < minPrice) {
                    minPrice = price;
                    continue;
                }
                int profit = price - minPrice;
                maxProfit = Math.max(profit, maxProfit);
            }
            return maxProfit;
        }
    };

    abstract int maxProfit(int[] prices);
}
