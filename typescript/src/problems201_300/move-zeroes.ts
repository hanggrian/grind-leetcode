class Problem {
  moveZeroes(nums: number[]) {
    throw new Error(`Not implemented (${nums}).`);
  }
}

class Default extends Problem {
  moveZeroes(nums: number[]) {
    let i = 0;
    for (let j = i + 1; j < nums.length; j++) {
      if (nums[i] === 0 && nums[j] !== 0) {
        const temp: number = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
      } else if (nums[i] !== 0) {
        i++;
      }
    }
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
