class Problem {
  twoSum(nums, target) {
    throw new Error(`Not implemented (${nums}, ${target}).`);
  }
}

class BruteForce extends Problem {
  twoSum(nums, target) {
    for (let i = 0; i < nums.length; i++) {
      const complement = target - nums[i];
      if (nums.slice(i + 1).includes(complement)) {
        return [i, nums.indexOf(complement, i + 1)];
      }
    }
    return undefined;
  }
}

class SinglePass extends Problem {
  twoSum(nums, target) {
    // remaining to index mapping
    const seen = {};
    for (let i = 0; i < nums.length; i++) {
      const complement = target - nums[i];
      if (complement in seen) {
        return [seen[complement], i];
      }
      seen[nums[i]] = i;
    }
    return [-1, -1];
  }
}

const SOLUTIONS = [new BruteForce(), new SinglePass()];
export default SOLUTIONS;
