class Problem {
  searchMatrix(matrix: number[][], target: number): boolean {
    throw new Error(`Not implemented (${matrix}, ${target}).`);
  }
}

class Default extends Problem {
  searchMatrix(matrix: number[][], target: number): boolean {
    let row: number = 0;
    if (matrix.length > 1) {
      for (let i = matrix.length - 1; i >= 0; i--) {
        if (matrix[i][0] > target) {
          continue;
        }
        row = i;
        break;
      }
    }
    let col: number = 0;
    while (col < matrix[0].length && matrix[row][col] <= target) {
      if (matrix[row][col] === target) {
        return true;
      }
      col++;
    }
    return false;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
