class Problem {
  merge(nums1: number[], m: number, nums2: number[], n: number) {
    throw new Error(`Not implemented (${nums1}, ${m}, ${nums2}, ${n}).`);
  }
}

class Default extends Problem {
  merge(nums1: number[], m: number, nums2: number[], n: number) {
    if (n >= 0) {
      for (let i = 0; i < n; i++) {
        nums1[m + i] = nums2[i];
      }
    }
    nums1.sort((a, b) => a - b);
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
