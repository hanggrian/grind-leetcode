class Problem {
  findPeakElement(nums: number[]): number {
    throw new Error(`Not implemented (${nums}).`);
  }
}

class Default extends Problem {
  findPeakElement(nums: number[]): number {
    let start: number = 0;
    let end: number = nums.length - 1;
    while (start < end) {
      if (nums[start] > nums[end]) {
        end--;
      } else {
        start++;
      }
    }
    return nums[end];
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
