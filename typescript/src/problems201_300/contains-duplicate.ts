class Problem {
  containsDuplicate(nums: number[]): boolean {
    throw new Error(`Not implemented (${nums}).`);
  }
}

class Default extends Problem {
  containsDuplicate(nums: number[]): boolean {
    nums.sort((a, b) => a - b);
    for (let i = 1; i < nums.length; i++) {
      if (nums[i] === nums[i - 1]) {
        return true;
      }
    }
    return false;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
