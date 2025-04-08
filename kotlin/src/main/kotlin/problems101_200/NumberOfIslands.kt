package problems101_200

enum class NumberOfIslands {
    DEFAULT {
        override fun numIslands(grid: Array<CharArray>): Int {
            val rows = grid.size
            val cols = grid[0].size
            val visited = Array(rows) { BooleanArray(cols) }

            var islands = 0
            for (row in 0 until rows) {
                for (col in 0 until cols) {
                    if (grid[row][col] != '1' || visited[row][col]) {
                        continue
                    }
                    dfs(grid, visited, row, col)
                    islands++
                }
            }
            return islands
        }

        fun dfs(grid: Array<CharArray>, visited: Array<BooleanArray>, row: Int, col: Int) {
            if (row < 0 ||
                row > grid.size - 1 ||
                col < 0 ||
                col > grid[0].size - 1 ||
                grid[row][col] != '1' ||
                visited[row][col]
            ) {
                return
            }
            visited[row][col] = true
            dfs(grid, visited, row - 1, col)
            dfs(grid, visited, row + 1, col)
            dfs(grid, visited, row, col - 1)
            dfs(grid, visited, row, col + 1)
        }
    },
    ;

    abstract fun numIslands(grid: Array<CharArray>): Int
}
