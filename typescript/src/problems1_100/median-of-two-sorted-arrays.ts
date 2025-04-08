class Problem {
  findMedianSortedArrays(nums1: number[], nums2: number[]): number {
    throw new Error(`Not implemented (${nums1}, ${nums2}).`);
  }
}

class Default extends Problem {
  findMedianSortedArrays(nums1: number[], nums2: number[]): number {
    const nums: number[] = nums1.concat(nums2);
    nums.sort();
    const center: number = Math.floor(nums.length / 2);
    if (nums.length % 2 === 1) {
      return nums[center];
    }
    return (nums[center - 1] + nums[center]) / 2;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
