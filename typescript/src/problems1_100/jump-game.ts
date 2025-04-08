class Problem {
  canJump(nums: number[]): boolean {
    throw new Error(`Not implemented (${nums}).`);
  }
}

class Default extends Problem {
  canJump(nums: number[]): boolean {
    let goal: number = nums.length - 1;
    for (let i = nums.length - 1; i >= 0; i--) {
      if (i + nums[i] >= goal) {
        goal = i;
      }
    }
    return goal === 0;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
