class Problem {
  twoSum(numbers: number[], target: number): number[] {
    throw new Error(`Not implemented (${numbers}, ${target}).`);
  }
}

class Default extends Problem {
  twoSum(numbers: number[], target: number): number[] {
    let start = 0;
    let end = numbers.length - 1;
    while (start < end) {
      const sum = numbers[start] + numbers[end];
      if (sum > target) {
        end--;
      } else if (sum < target) {
        start++;
      } else {
        break; // found
      }
    }
    return [start + 1, end + 1];
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
