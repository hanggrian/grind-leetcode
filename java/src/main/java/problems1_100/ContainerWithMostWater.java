package problems1_100;

enum ContainerWithMostWater {
    DEFAULT {
        @Override
        int maxArea(int[] height) {
            int start = 0;
            int end = height.length - 1;
            int maxArea = Integer.MIN_VALUE;
            while (start < end) {
                int wall = Math.min(height[start], height[end]);
                maxArea = Math.max(maxArea, (end - start) * wall);
                if (height[start] < height[end]) {
                    start++;
                } else {
                    end--;
                }
            }
            return maxArea;
        }
    };

    abstract int maxArea(int[] height);
}
