class Problem {
  maxProfit(prices: number[]): number {
    throw new Error(`Not implemented (${prices}).`);
  }
}

class Default extends Problem {
  maxProfit(prices: number[]): number {
    let minPrice = Number.MAX_SAFE_INTEGER;
    let maxProfit = 0;
    for (let price of prices) {
      if (price < minPrice) {
        minPrice = price;
        continue;
      }
      const profit = price - minPrice;
      maxProfit = Math.max(profit, maxProfit);
    }
    return maxProfit;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
