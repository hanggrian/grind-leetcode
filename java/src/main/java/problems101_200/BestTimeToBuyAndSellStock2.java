package problems101_200;

enum BestTimeToBuyAndSellStock2 {
    DEFAULT {
        @Override
        int maxProfit(int[] prices) {
            int profit = 0;
            boolean hold = false;
            for (int i = 0; i < prices.length; i++) {
                if (i != prices.length - 1 && prices[i + 1] > prices[i]) {
                    if (!hold) {
                        hold = true;
                        profit -= prices[i];
                    }
                    continue;
                }
                if (!hold) {
                    continue;
                }
                hold = false;
                profit += prices[i];
            }
            return profit;
        }
    };

    abstract int maxProfit(int[] prices);
}
