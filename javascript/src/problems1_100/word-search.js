class Problem {
  exist(board, word) {
    throw new Error(`Not implemented (${board}, ${word}).`);
  }
}

class Default extends Problem {
  exist(board, word) {
    const rows = board.length;
    const cols = board[0].length;
    for (let row = 0; row < rows; row++) {
      for (let col = 0; col < cols; col++) {
        const visited = new Array(rows);
        for (let i = 0; i < rows; i++) {
          visited[i] = new Array(cols);
        }

        if (board[row][col] === word[0]
            && this.dfs(board, visited, word, row, col)) {
          return true;
        }
      }
    }
    return false;
  }

  dfs(board, visited, word, row, col) {
    if (row < 0 || row > board.length - 1
        || col < 0 || col > board[0].length - 1
        || visited[row][col] || word.length === 0 || word[0] !== board[row][col]) {
      return word.length === 0;
    }
    word = word.slice(1);
    visited[row][col] = true;
    if (this.dfs(board, visited, word, row - 1, col) ||
        this.dfs(board, visited, word, row + 1, col) ||
        this.dfs(board, visited, word, row, col - 1) ||
        this.dfs(board, visited, word, row, col + 1)) {
      return true;
    }

    visited[row][col] = false;
    return false;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
