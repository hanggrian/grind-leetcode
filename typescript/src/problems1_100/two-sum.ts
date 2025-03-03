class Problem {
  twoSum(nums: number[], target: number): number[] {
    throw new Error(`'Not implemented (${nums}, ${target}).`);
  }
}

class BruteForce extends Problem {
  twoSum(nums: number[], target: number): number[] {
    for (let i = 0; i < nums.length; i++) {
      let complement = target - nums[i];
      if (nums.slice(i + 1).includes(complement)) {
        return [i, nums.indexOf(complement, i + 1)];
      }
    }
    return undefined;
  }
}

class SinglePass extends Problem {
  twoSum(nums: number[], target: number): number[] {
    // remaining to index mapping
    let seen = {};
    for (let i = 0; i < nums.length; i++) {
      let complement = target - nums[i];
      if (complement in seen) {
        return [seen[complement], i];
      }
      seen[nums[i]] = i;
    }
    return [-1, -1];
  }
}

export const SOLUTIONS = [new BruteForce(), new SinglePass()];
