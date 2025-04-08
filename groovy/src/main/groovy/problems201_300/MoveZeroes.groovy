package problems201_300

enum MoveZeroes {
    DEFAULT{
        @Override
        void moveZeroes(int[] nums) {
            var i = 0
            for (var j = i + 1; j < nums.length; j++) {
                if (nums[i] == 0 && nums[j] != 0) {
                    var temp = nums[i]
                    nums[i] = nums[j]
                    nums[j] = temp
                    i++
                } else if (nums[i] != 0) {
                    i++
                }
            }
        }
    }

    abstract void moveZeroes(int[] nums)
}
