class Problem {
  merge(intervals: number[][]): number[][] {
    throw new Error(`Not implemented (${intervals}).`);
  }
}

class Default extends Problem {
  merge(intervals: number[][]): number[][] {
    intervals.sort((a, b) => a[0] - b[0]);
    const newIntervals = [];
    newIntervals.push(intervals[0]);
    for (let i = 1; i < intervals.length; i++) {
      const last = newIntervals[newIntervals.length - 1];
      if (last[1] < intervals[i][0]) {
        newIntervals.push(intervals[i]);
        continue;
      }
      newIntervals.pop();
      newIntervals.push(
          [
            last[0],
            Math.max(last[1], intervals[i][1]),
          ],
      );
    }

    const result = new Array<number[]>(newIntervals.length);
    for (let i = 0; i < newIntervals.length; i++) {
      result[i] = newIntervals[i];
    }
    return result;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
