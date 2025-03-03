class Problem {
  searchInsert(nums, target) {
    throw new Error(`'Not implemented (${nums}, ${target}).`);
  }
}

class SlidingWindow extends Problem {
  searchInsert(nums, target) {
    let start = 0;
    let end = nums.length - 1;
    while (start <= end) {
      let center = Math.floor((start + end) / 2);
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
  searchInsert(nums, target) {
    return this.binarySearch(nums, target, 0, nums.length - 1);
  }

  binarySearch(nums, target, start, end) {
    let center = Math.floor((start + end) / 2);
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

export const SOLUTIONS = [new SlidingWindow(), new BinarySearch()];
