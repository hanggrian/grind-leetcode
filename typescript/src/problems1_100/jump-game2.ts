class Problem {
  jump(nums: number[]): number {
    throw new Error(`Not implemented (${nums}).`);
  }
}

class Default extends Problem {
  jump(nums: number[]): number {
    let steps: number = 0;
    let maxLastJump: number = 0;
    let maxCurrentJump: number = 0;
    for (let i = 0; i < nums.length - 1; i++) {
      maxCurrentJump = Math.max(maxCurrentJump, i + nums[i]);
      if (i !== maxLastJump) {
        continue;
      }
      steps++;
      maxLastJump = maxCurrentJump;
    }
    return steps;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
