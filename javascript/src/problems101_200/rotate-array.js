class Problem {
  rotate(nums, k) {
    throw new Error(`Not implemented (${nums}, ${k}).`);
  }
}

class Default extends Problem {
  rotate(nums, k) {
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

  reverse(nums, left, right) {
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
