class Problem {
  numberOfArithmeticSlices(nums) {
    throw new Error(`Not implemented (${nums}).`);
  }
}

class Default extends Problem {
  numberOfArithmeticSlices(nums) {
    if (nums.length < 3) {
      return 0;
    }
    const slices = new Array(nums.length).fill(0);
    let result = 0;
    for (let i = 2; i < nums.length; i++) {
      if (nums[i] - nums[i - 1] !== nums[i - 1] - nums[i - 2]) {
        continue;
      }
      slices[i] = slices[i - 1] + 1;
      result += slices[i];
    }
    return result;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
