class Problem {
  maxProduct(nums: number[]): number {
    throw new Error(`Not implemented (${nums}).`);
  }
}

class Default extends Problem {
  maxProduct(nums: number[]): number {
    const maxs = new Array<number>(nums.length);
    const mins = new Array<number>(nums.length);
    maxs[0] = nums[0];
    mins[0] = nums[0];
    let result = nums[0];
    for (let i = 1; i < nums.length; i++) {
      if (nums[i] > 0) {
        maxs[i] = Math.max(maxs[i - 1] * nums[i], nums[i]);
        mins[i] = Math.min(mins[i - 1] * nums[i], nums[i]);
      } else {
        maxs[i] = Math.max(mins[i - 1] * nums[i], nums[i]);
        mins[i] = Math.min(maxs[i - 1] * nums[i], nums[i]);
      }
      result = Math.max(maxs[i], result);
    }
    return result;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
