package problems101_200

enum SingleNumber {
    DEFAULT {
        @Override
        int singleNumber(int[] nums) {
            ArrayList<Integer> result = []
            for (var num : nums) {
                if (!result.contains(num)) {
                    result.add(num)
                } else {
                    result.remove(num.toInteger())
                }
            }
            return result[0]
        }
    }

    abstract int singleNumber(int[] nums)
}
