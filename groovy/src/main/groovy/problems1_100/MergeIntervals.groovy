package problems1_100

enum MergeIntervals {
    DEFAULT{
        @Override
        int[][] merge(int[][] intervals) {
            Arrays.sort(intervals, Comparator.comparingInt(array -> array[0]))
            ArrayList<int[]> newIntervals = []
            newIntervals.add(intervals[0])
            for (var i = 1; i < intervals.length; i++) {
                var last = newIntervals[-1]
                if (last[1] < intervals[i][0]) {
                    newIntervals.add(intervals[i])
                    continue
                }
                newIntervals.remove(newIntervals.size() - 1)
                newIntervals.add(
                    new int[]{
                        last[0],
                        Math.max(last[1], intervals[i][1]),
                    }
                )
            }

            var result = new int[newIntervals.size()][2]
            for (var i = 0; i < newIntervals.size(); i++) {
                result[i] = newIntervals[i]
            }
            return result
        }
    }

    abstract int[][] merge(int[][] intervals)
}
