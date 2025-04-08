package problems401_500

enum class IslandPerimeter {
    DEFAULT {
        override fun islandPerimeter(grid: Array<IntArray>): Int {
            val rows = grid.size
            val cols = grid[0].size

            var islands = 0
            var neighbours = 0
            for (row in 0 until rows) {
                for (col in 0 until cols) {
                    if (grid[row][col] != 1) {
                        continue
                    }
                    islands++
                    if (row - 1 >= 0 && grid[row - 1][col] == 1) {
                        neighbours++
                    }
                    if (row + 1 < rows && grid[row + 1][col] == 1) {
                        neighbours++
                    }
                    if (col - 1 >= 0 && grid[row][col - 1] == 1) {
                        neighbours++
                    }
                    if (col + 1 < cols && grid[row][col + 1] == 1) {
                        neighbours++
                    }
                }
            }
            return islands * 4 - neighbours
        }
    },
    ;

    abstract fun islandPerimeter(grid: Array<IntArray>): Int
}
