class Problem {
  sortColors(nums) {
    throw new Error(`Not implemented (${nums}).`);
  }
}

class Default extends Problem {
  sortColors(nums) {
    for (let i = 0; i < nums.length - 1; i++) {
      for (let j = i + 1; j < nums.length; j++) {
        if (nums[j] >= nums[i]) {
          continue;
        }
        const temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
      }
    }
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
