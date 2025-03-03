class Problem {
  findMedianSortedArrays(nums1, nums2) {
    throw new Error(`'Not implemented (${nums1}, ${nums2}).`);
  }
}

class Default extends Problem {
  findMedianSortedArrays(nums1, nums2) {
    let nums = nums1.concat(nums2);
    nums.sort();
    let center = Math.floor(nums.length / 2);
    if (nums.length % 2 === 1) {
      return nums[center];
    }
    return (nums[center - 1] + nums[center]) / 2;
  }
}

export const SOLUTIONS = [new Default()];
