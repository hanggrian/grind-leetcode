package problems1_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

enum MergeIntervals {
    DEFAULT {
        @Override
        int[][] merge(int[][] intervals) {
            Arrays.sort(intervals, Comparator.comparingInt(array -> array[0]));
            List<int[]> newIntervals = new ArrayList<>();
            newIntervals.add(intervals[0]);
            for (int i = 1; i < intervals.length; i++) {
                int[] last = newIntervals.get(newIntervals.size() - 1);
                if (last[1] < intervals[i][0]) {
                    newIntervals.add(intervals[i]);
                    continue;
                }
                newIntervals.remove(newIntervals.size() - 1);
                newIntervals.add(
                    new int[]{
                        last[0],
                        Math.max(last[1], intervals[i][1]),
                    }
                );
            }

            int[][] result = new int[newIntervals.size()][2];
            for (int i = 0; i < newIntervals.size(); i++) {
                result[i] = newIntervals.get(i);
            }
            return result;
        }
    };

    abstract int[][] merge(int[][] intervals);
}
