class Problem {
  islandPerimeter(grid: number[][]): number {
    throw new Error(`Not implemented (${grid}).`);
  }
}

class Default extends Problem {
  islandPerimeter(grid: number[][]): number {
    const rows: number = grid.length;
    const cols: number = grid[0].length;

    let islands: number = 0;
    let neighbors: number = 0;
    for (let row = 0; row < rows; row++) {
      for (let col = 0; col < cols; col++) {
        if (grid[row][col] !== 1) {
          continue;
        }
        islands++;
        if (row - 1 >= 0 && grid[row - 1][col] === 1) {
          neighbors++;
        }
        if (row + 1 < rows && grid[row + 1][col] === 1) {
          neighbors++;
        }
        if (col - 1 >= 0 && grid[row][col - 1] === 1) {
          neighbors++;
        }
        if (col + 1 < cols && grid[row][col + 1] === 1) {
          neighbors++;
        }
      }
    }
    return islands * 4 - neighbors;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
