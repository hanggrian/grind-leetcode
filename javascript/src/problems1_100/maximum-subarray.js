class Problem {
  maxSubArray(nums) {
    throw new Error(`Not implemented (${nums}).`);
  }
}

class Default extends Problem {
  maxSubArray(nums) {
    let current = 0;
    let arraySum = nums[0];
    for (const num of nums) {
      current = Math.max(current, 0);
      current += num;
      arraySum = Math.max(arraySum, current);
    }
    return arraySum;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
