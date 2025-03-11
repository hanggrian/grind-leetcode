class Problem {
  removeDuplicates(nums) {
    throw new Error(`Not implemented (${nums}).`);
  }
}

class CreateCopy extends Problem {
  removeDuplicates(nums) {
    const distinct = new Set(nums);
    let i = 0;
    for (const num of distinct) {
      nums[i++] = num;
    }
    return distinct.size;
  }
}

class SinglePass extends Problem {
  removeDuplicates(nums) {
    let start = 1;
    let end = 1;
    while (end < nums.length) {
      if (nums[end] !== nums[end - 1]) {
        nums[start++] = nums[end];
      }
      end++;
    }
    return start;
  }
}

const SOLUTIONS = [new CreateCopy(), new SinglePass()];
export default SOLUTIONS;
