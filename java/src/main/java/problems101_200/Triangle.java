package problems101_200;

import java.util.ArrayList;
import java.util.List;

enum Triangle {
    DEFAULT {
        @Override
        int minimumTotal(List<List<Integer>> triangle) {
            int maxRow = triangle.size();
            int maxCol = 2;

            List<List<Integer>> dp = new ArrayList<>(maxRow);
            for (int i = 0; i < maxRow; i++) {
                dp.add(new ArrayList<>());
            }
            dp.get(0).add(triangle.get(0).get(0));
            int row = 1;
            int col = 0;
            while (row < maxRow) {
                List<Integer> columns = new ArrayList<>();
                if (col > 0) {
                    columns.add(triangle.get(row).get(col) + dp.get(row - 1).get(col - 1));
                }
                if (col < maxCol - 1) {
                    columns.add(triangle.get(row).get(col) + dp.get(row - 1).get(col));
                }
                dp.get(row).add(getMinimum(columns));
                col++;
                if (col != maxCol) {
                    continue;
                }
                col = 0;
                row++;
                maxCol++;
            }
            return getMinimum(dp.get(dp.size() - 1));
        }

        int getMinimum(List<Integer> columns) {
            int minimum = columns.get(0);
            for (int i = 1; i < columns.size(); i++) {
                if (columns.get(i) < minimum) {
                    minimum = columns.get(i);
                }
            }
            return minimum;
        }
    };

    abstract int minimumTotal(List<List<Integer>> triangle);
}
