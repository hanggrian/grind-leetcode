class Problem {
  rotate(nums: number[], k: number) {
    throw new Error(`Not implemented (${nums}, ${k}).`);
  }
}

class Default extends Problem {
  rotate(nums: number[], k: number) {
    if (k === 0 || k % nums.length === 0) {
      return;
    }
    if (k > nums.length) {
      k %= nums.length;
    }
    this.reverse(nums, 0, nums.length - 1);
    this.reverse(nums, 0, k - 1);
    this.reverse(nums, k, nums.length - 1);
  }

  reverse(nums: number[], left: number, right: number) {
    while (left < right) {
      const temp = nums[left];
      nums[left] = nums[right];
      nums[right] = temp;
      left++;
      right--;
    }
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
