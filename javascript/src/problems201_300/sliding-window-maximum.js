class Problem {
  maxSlidingWindow(nums, k) {
    throw new Error(`Not implemented (${nums}, ${k}).`);
  }
}

class Default extends Problem {
  maxSlidingWindow(nums, k) {
    const queue = [];
    const maxes = new Array(nums.length - k + 1);
    let left = 0;
    let right = 0;
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
