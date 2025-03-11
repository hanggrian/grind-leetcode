package problems101_200

enum PascalsTriangle {
    DEFAULT{
        @Override
        List<List<Integer>> generate(int numRows) {
            var rows = new ArrayList<>(numRows)
            rows.add(Collections.singletonList(1))
            for (var i = 1; i < numRows; i++) {
                var numColumns = i + 1
                var columns = new ArrayList<>(numColumns)
                for (var j = 0; j < numColumns; j++) {
                    if (j == 0 || j == numColumns - 1) {
                        columns.add(1)
                        continue
                    }
                    var prevColumns = rows[i - 1]
                    columns.add(prevColumns[j - 1] + prevColumns[j])
                }
                rows.add(columns)
            }
            return rows
        }
    }

    abstract List<List<Integer>> generate(int numRows)
}
