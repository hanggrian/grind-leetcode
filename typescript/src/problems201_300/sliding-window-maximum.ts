class Problem {
  maxSlidingWindow(nums: number[], k: number): number[] {
    throw new Error(`Not implemented (${nums}, ${k}).`);
  }
}

class Default extends Problem {
  maxSlidingWindow(nums: number[], k: number): number[] {
    const queue: number[] = [];
    const maxes: number[] = new Array(nums.length - k + 1);
    let left: number = 0;
    let right: number = 0;
    while (right < nums.length) {
      while (queue.length > 0 && nums[queue[queue.length - 1]] < nums[right]) {
        queue.pop();
      }
      queue.push(right);
      if (left > queue[0]) {
        queue.shift();
      }
      if (right + 1 >= k) {
        maxes[left] = nums[queue[0]];
        left++;
      }
      right++;
    }
    return maxes;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
