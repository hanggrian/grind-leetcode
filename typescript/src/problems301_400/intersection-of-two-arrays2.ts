class Problem {
  intersect(nums1: number[], nums2: number[]): number[] {
    throw new Error(`Not implemented (${nums1}, ${nums2}).`);
  }
}

class Default extends Problem {
  intersect(nums1: number[], nums2: number[]): number[] {
    nums1.sort((a, b) => a - b);
    nums2.sort((a, b) => a - b);

    let i: number = 0;
    let j: number = 0;
    const result: number[] = [];
    while (i < nums1.length && j < nums2.length) {
      if (nums1[i] < nums2[j]) {
        i++;
      } else if (nums1[i] > nums2[j]) {
        j++;
      } else {
        result.push(nums1[i]);
        i++;
        j++;
      }
    }
    return result;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
