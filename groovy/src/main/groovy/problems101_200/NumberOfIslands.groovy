package problems101_200

enum NumberOfIslands {
    DEFAULT{
        @Override
        int numIslands(char[][] grid) {
            var rows = grid.length
            var cols = grid[0].length
            var visited = new boolean[rows][cols]

            var islands = 0
            for (var row = 0; row < rows; row++) {
                for (var col = 0; col < cols; col++) {
                    if (grid[row][col] != '1' as char || visited[row][col]) {
                        continue
                    }
                    dfs(grid, visited, row, col)
                    islands++
                }
            }
            return islands
        }

        void dfs(char[][] grid, boolean[][] visited, int row, int col) {
            if (row < 0 ||
                row > grid.length - 1 ||
                col < 0 ||
                col > grid[0].length - 1 ||
                grid[row][col] != '1' as char ||
                visited[row][col]) {
                return
            }
            visited[row][col] = true
            dfs(grid, visited, row - 1, col)
            dfs(grid, visited, row + 1, col)
            dfs(grid, visited, row, col - 1)
            dfs(grid, visited, row, col + 1)
        }
    }

    abstract int numIslands(char[][] grid)
}
