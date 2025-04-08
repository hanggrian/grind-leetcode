class Problem {
  isValidSudoku(board: string[][]): boolean {
    throw new Error(`Not implemented (${board}).`);
  }
}

class Default extends Problem {
  isValidSudoku(board: string[][]): boolean {
    const rows: Set<string> = new Set();
    const cols: Set<string> = new Set();
    const subBoard: Set<string> = new Set();
    for (let i = 0; i < 9; i++) {
      rows.clear();
      cols.clear();
      for (let j = 0; j < 9; j++) {
        if (board[i][j] !== '.' && rows.has(board[i][j])) {
          return false;
        }
        if (board[j][i] !== '.' && cols.has(board[j][i])) {
          return false;
        }
        rows.add(board[i][j]);
        cols.add(board[j][i]);
        if (i % 3 !== 0 || j % 3 !== 0) {
          continue;
        }
        subBoard.clear();
        for (let i2 = i; i2 < i + 3; i2++) {
          for (let j2 = j; j2 < j + 3; j2++) {
            if (board[i2][j2] !== '.' && subBoard.has(board[i2][j2])) {
              return false;
            }
          }
        }
      }
    }
    return true;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
