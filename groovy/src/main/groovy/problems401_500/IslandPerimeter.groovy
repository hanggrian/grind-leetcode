package problems401_500

enum IslandPerimeter {
    DEFAULT{
        @Override
        int islandPerimeter(int[][] grid) {
            var rows = grid.length
            var cols = grid[0].length

            var islands = 0
            var neighbours = 0
            for (var row = 0; row < rows; row++) {
                for (var col = 0; col < cols; col++) {
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
    }

    abstract int islandPerimeter(int[][] grid)
}
