class Problem {
  removeElement(nums, val) {
    throw new Error(`Not implemented (${nums}, ${val}).`);
  }
}

class Default extends Problem {
  removeElement(nums, val) {
    let start = 0;
    let end = 0;
    while (start < nums.length) {
      if (nums[start] !== val) {
        nums[end++] = nums[start];
      }
      start++;
    }
    return end;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
