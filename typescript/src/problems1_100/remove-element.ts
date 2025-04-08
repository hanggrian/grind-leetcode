class Problem {
  removeElement(nums: number[], val: number): number {
    throw new Error(`Not implemented (${nums}, ${val}).`);
  }
}

class Default extends Problem {
  removeElement(nums: number[], val: number): number {
    let start: number = 0;
    let end: number = 0;
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
