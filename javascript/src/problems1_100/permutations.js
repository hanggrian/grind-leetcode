class Problem {
  permute(nums) {
    throw new Error(`Not implemented (${nums}).`);
  }
}

class Default extends Problem {
  permute(nums) {
    const result = [];
    this.permutation(
        result,
        nums,
        [],
    );
    return result;
  }

  permutation(result, nums, prefix) {
    if (nums.length === 0) {
      result.push(prefix);
      return;
    }
    for (let i = 0; i < nums.length; i++) {
      const remove = [];
      remove.push(...nums.slice(0, i));
      remove.push(...nums.slice(i + 1, nums.length));

      const newPrefix = [...prefix];
      newPrefix.push(nums[i]);
      this.permutation(result, remove, newPrefix);
    }
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
