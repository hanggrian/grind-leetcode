class Problem {
  maxArea(height: number[]): number {
    throw new Error(`Not implemented (${height}).`);
  }
}

class Default extends Problem {
  maxArea(height: number[]): number {
    let start = 0;
    let end = height.length - 1;
    let maxArea = Number.MIN_SAFE_INTEGER - 1;
    while (start < end) {
      const wall = Math.min(height[start], height[end]);
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

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
