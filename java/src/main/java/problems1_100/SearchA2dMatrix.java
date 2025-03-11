package problems1_100;

enum SearchA2dMatrix {
    DEFAULT {
        @Override
        boolean searchMatrix(int[][] matrix, int target) {
            int row = 0;
            if (matrix.length > 1) {
                for (int i = matrix.length - 1; i >= 0; i--) {
                    if (matrix[i][0] > target) {
                        continue;
                    }
                    row = i;
                    break;
                }
            }
            int col = 0;
            while (col < matrix[0].length && matrix[row][col] <= target) {
                if (matrix[row][col] == target) {
                    return true;
                }
                col++;
            }
            return false;
        }
    };

    abstract boolean searchMatrix(int[][] matrix, int target);
}
