class Problem {
  minimumTotal(triangle: number[][]): number {
    throw new Error(`Not implemented (${triangle}).`);
  }
}

class Default extends Problem {
  minimumTotal(triangle: number[][]): number {
    let maxRow: number = triangle.length;
    let maxCol: number = 2;

    const dp: number[][] = new Array(maxRow);
    for (let i = 0; i < maxRow; i++) {
      dp[i] = [];
    }
    dp[0].push(triangle[0][0]);
    let row: number = 1;
    let col: number = 0;
    while (row < maxRow) {
      const columns: number[] = [];
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
    let minimum: number = columns[0];
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
