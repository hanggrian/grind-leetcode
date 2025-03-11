package problems101_200

enum Triangle {
    DEFAULT {
        @Override
        int minimumTotal(List<List<Integer>> triangle) {
            var maxRow = triangle.size()
            var maxCol = 2

            ArrayList<List<Integer>> dp = []
            for (var i = 0; i < maxRow; i++) {
                dp.add([])
            }
            dp[0].add(triangle[0][0])
            var row = 1
            var col = 0

            while (row < maxRow) {
                ArrayList<Integer> columns = []
                if (col > 0) {
                    columns.add(triangle[row][col] + dp[row - 1][col - 1])
                }
                if (col < maxCol - 1) {
                    columns.add(triangle[row][col] + dp[row - 1][col])
                }
                dp[row].add(getMinimum(columns))
                col++
                if (col != maxCol) {
                    continue
                }
                col = 0
                row++
                maxCol++
            }
            return getMinimum(dp[-1])
        }

        int getMinimum(List<Integer> columns) {
            var minimum = columns[0]
            for (var i = 1; i < columns.size(); i++) {
                if (columns[i] < minimum) {
                    minimum = columns[i]
                }
            }
            return minimum
        }
    }

    abstract int minimumTotal(List<List<Integer>> triangle);
}
