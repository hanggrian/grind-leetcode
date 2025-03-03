class Problem {
  maxArea(height) {
    throw new Error(`'Not implemented (${height}).`);
  }
}

class Default extends Problem {
  maxArea(height) {
    let start = 0;
    let end = height.length - 1;
    let maxArea = Number.MIN_SAFE_INTEGER - 1;
    while (start < end) {
      let wall = Math.min(height[start], height[end]);
      maxArea = Math.max(maxArea, (end - start) * wall);
      if (height[start] < height[end]) {
        start++;
      } else {
        end--;
      }
    }
    return maxArea;
  }
}

export const SOLUTIONS = [new Default()];
