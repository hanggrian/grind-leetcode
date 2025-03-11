class Problem {
  searchInsert(nums: number[], target: number): number {
    throw new Error(`Not implemented (${nums}, ${target}).`);
  }
}

class SlidingWindow extends Problem {
  searchInsert(nums: number[], target: number): number {
    let start = 0;
    let end = nums.length - 1;
    while (start <= end) {
      const center = Math.floor((start + end) / 2);
      if (nums[center] < target) {
        start = center + 1;
      } else if (nums[center] > target) {
        end = center - 1;
      } else {
        return center;
      }
    }
    return end + 1;
  }
}

class BinarySearch extends Problem {
  searchInsert(nums: number[], target: number): number {
    return this.binarySearch(nums, target, 0, nums.length - 1);
  }

  binarySearch(nums: number[], target: number, start: number, end: number) {
    const center = Math.floor((start + end) / 2);
    if (start > end) {
      return end + 1;
    }
    if (nums[center] < target) {
      return this.binarySearch(nums, target, center + 1, end);
    }
    if (nums[center] > target) {
      return this.binarySearch(nums, target, start, center - 1);
    }
    return center;
  }
}

const SOLUTIONS = [new SlidingWindow(), new BinarySearch()];
export default SOLUTIONS;
