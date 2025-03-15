class Problem {
  minimumTotal(triangle: number[][]): number {
    throw new Error(`Not implemented (${triangle}).`);
  }
}

class Default extends Problem {
  minimumTotal(triangle: number[][]): number {
    let maxRow = triangle.length;
    let maxCol = 2;

    const dp = new Array<number[]>(maxRow);
    for (let i = 0; i < maxRow; i++) {
      dp[i] = [];
    }
    dp[0].push(triangle[0][0]);
    let row = 1;
    let col = 0;
    while (row < maxRow) {
      const columns = [];
      if (col > 0) {
        columns.push(triangle[row][col] + dp[row - 1][col - 1]);
      }
      if (col < maxCol - 1) {
        columns.push(triangle[row][col] + dp[row - 1][col]);
      }
      dp[row].push(this.getMinimum(columns));
      col++;
      if (col !== maxCol) {
        continue;
      }
      col = 0;
      row++;
      maxCol++;
    }
    return this.getMinimum(dp[dp.length - 1]);
  }

  getMinimum(columns: number[]): number {
    let minimum = columns[0];
    for (let i = 1; i < columns.length; i++) {
      if (columns[i] < minimum) {
        minimum = columns[i];
      }
    }
    return minimum;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
