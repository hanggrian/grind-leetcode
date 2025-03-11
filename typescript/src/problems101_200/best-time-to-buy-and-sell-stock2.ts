class Problem {
  maxProfit(prices: number[]): number {
    throw new Error(`Not implemented (${prices}).`);
  }
}

class Default extends Problem {
  maxProfit(prices: number[]): number {
    let profit = 0;
    let hold = false;
    for (let i = 0; i < prices.length; i++) {
      if (i !== prices.length - 1 && prices[i + 1] > prices[i]) {
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
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
