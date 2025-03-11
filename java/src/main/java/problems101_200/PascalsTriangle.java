package problems101_200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

enum PascalsTriangle {
    DEFAULT {
        @Override
        List<List<Integer>> generate(int numRows) {
            List<List<Integer>> rows = new ArrayList<>(numRows);
            rows.add(Collections.singletonList(1));
            for (int i = 1; i < numRows; i++) {
                int numColumns = i + 1;
                List<Integer> columns = new ArrayList<>(numColumns);
                for (int j = 0; j < numColumns; j++) {
                    if (j == 0 || j == numColumns - 1) {
                        columns.add(1);
                        continue;
                    }
                    List<Integer> prevColumns = rows.get(i - 1);
                    columns.add(prevColumns.get(j - 1) + prevColumns.get(j));
                }
                rows.add(columns);
            }
            return rows;
        }
    };

    abstract List<List<Integer>> generate(int numRows);
}
