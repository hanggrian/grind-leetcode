class Problem {
  singleNumber(nums: number[]): number {
    throw new Error(`Not implemented (${nums}).`);
  }
}

class Default extends Problem {
  singleNumber(nums: number[]): number {
    const result = [];
    for (const num of nums) {
      const index = result.indexOf(num);
      if (index === -1) {
        result.push(num);
      } else {
        result.splice(index, 1);
      }
    }
    return result[0];
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
