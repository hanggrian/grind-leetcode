class Problem {
  intersect(nums1, nums2) {
    throw new Error(`Not implemented (${nums1}, ${nums2}).`);
  }
}

class Default extends Problem {
  intersect(nums1, nums2) {
    nums1.sort((a, b) => a - b);
    nums2.sort((a, b) => a - b);

    let i = 0;
    let j = 0;
    const result = [];
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
