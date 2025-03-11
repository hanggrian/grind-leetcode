class Problem {
  threeSum(nums: number[]): number[][] {
    throw new Error(`Not implemented (${nums}).`);
  }
}

class Default extends Problem {
  threeSum(nums: number[]): number[][] {
    const result = [];
    if (nums.length < 3) {
      return result;
    }
    nums.sort();
    for (let i = 0; i < nums.length; i++) {
      if (i > 0 && nums[i] === nums[i - 1]) {
        continue; // skip same result
      }
      let j = i + 1;
      let k = nums.length - 1;
      while (j < k) {
        const threeSum = nums[i] + nums[j] + nums[k];
        if (threeSum === 0) {
          result.push([nums[i], nums[j], nums[k]]);
          j++;
          k--;
          while (j < k && nums[j] === nums[j + 1]) {
            j++; // skip same result
          }
          while (j < k && nums[k] === nums[k - 1]) {
            k--; // skip same result
          }
        } else if (threeSum < 0) {
          j++;
        } else {
          k--;
        }
      }
    }
    return result;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
