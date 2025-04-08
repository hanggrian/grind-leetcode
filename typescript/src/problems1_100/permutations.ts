class Problem {
  permute(nums: number[]): number[][] {
    throw new Error(`Not implemented (${nums}).`);
  }
}

class Default extends Problem {
  permute(nums: number[]): number[][] {
    const result = [];
    this.permutation(
        result,
        nums,
        [],
    );
    return result;
  }

  permutation(result: number[][], nums: number[], prefix: number[]) {
    if (nums.length === 0) {
      result.push(prefix);
      return;
    }
    for (let i = 0; i < nums.length; i++) {
      const remove: number[] = [];
      remove.push(...nums.slice(0, i));
      remove.push(...nums.slice(i + 1, nums.length));

      const newPrefix: number[] = [...prefix];
      newPrefix.push(nums[i]);
      this.permutation(result, remove, newPrefix);
    }
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
