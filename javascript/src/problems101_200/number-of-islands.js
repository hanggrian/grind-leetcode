class Problem {
  numIslands(grid) {
    throw new Error(`Not implemented (${grid}).`);
  }
}

class Default extends Problem {
  numIslands(grid) {
    const rows = grid.length;
    const cols = grid[0].length;
    const visited = new Array(rows).fill(new Array(cols));

    let islands = 0;
    for (let row = 0; row < rows; row++) {
      for (let col = 0; col < cols; col++) {
        if (grid[row][col] !== '1' || visited[row][col]) {
          continue;
        }
        this.dfs(grid, visited, row, col);
        islands++;
      }
    }
    return islands;
  }

  dfs(grid, visited, row, col) {
    if (row < 0 ||
        row > grid.length - 1 ||
        col < 0 ||
        col > grid[0].length - 1 ||
        grid[row][col] !== '1' ||
        visited[row][col]
    ) {
      return;
    }
    visited[row][col] = true;
    this.dfs(grid, visited, row - 1, col);
    this.dfs(grid, visited, row + 1, col);
    this.dfs(grid, visited, row, col - 1);
    this.dfs(grid, visited, row, col + 1);
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
