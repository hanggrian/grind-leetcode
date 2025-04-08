class Problem {
  rob(nums: number[]): number {
    throw new Error(`Not implemented (${nums}).`);
  }
}

class Default extends Problem {
  rob(nums: number[]): number {
    if (nums.length === 1) {
      return nums[0];
    }
    const moneys: number[] = new Array(nums.length);
    moneys[0] = nums[0];
    moneys[1] = Math.max(nums[0], nums[1]);
    for (let i = 2; i < nums.length; i++) {
      moneys[i] = Math.max(nums[i] + moneys[i - 2], moneys[i - 1]);
    }
    return moneys[moneys.length - 1];
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
