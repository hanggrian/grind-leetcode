class Problem {
  trap(height) {
    throw new Error(`Not implemented (${height}).`);
  }
}

class Default extends Problem {
  trap(height) {
    if (height.length < 3) {
      return 0;
    }

    // create two arrays of increasing height for each end
    const ltrHeight = new Array(height.length);
    const rtlHeight = new Array(height.length);
    ltrHeight[0] = height[0];
    rtlHeight[height.length - 1] = height[height.length - 1];
    for (let i = 1; i < height.length; i++) {
      ltrHeight[i] = Math.max(ltrHeight[i - 1], height[i]);
    }
    for (let i = height.length - 2; i >= 0; i--) {
      rtlHeight[i] = Math.max(rtlHeight[i + 1], height[i]);
    }

    // the overlap between two heights is the water
    let water = 0;
    for (let i = 0; i < height.length; i++) {
      water += Math.min(ltrHeight[i], rtlHeight[i]) - height[i];
    }
    return water;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
