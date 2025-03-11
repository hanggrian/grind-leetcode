package problems1_100

enum ContainerWithMostWater {
    DEFAULT{
        @Override
        int maxArea(int[] height) {
            var start = 0
            var end = height.length - 1
            var maxArea = Integer.MIN_VALUE
            while (start < end) {
                var wall = Math.min(height[start], height[end])
                maxArea = Math.max(maxArea, (end - start) * wall)
                if (height[start] < height[end]) {
                    start++
                } else {
                    end--
                }
            }
            return maxArea
        }
    }

    abstract int maxArea(int[] height)
}
