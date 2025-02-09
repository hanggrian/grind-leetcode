package problems1;

public enum ContainerWithMostWater {
    DEFAULT {
        @Override
        public int maxArea(int[] height) {
            int start = 0;
            int end = height.length - 1;
            int max = Integer.MIN_VALUE;
            while (start < end) {
                int wall = Math.min(height[start], height[end]);
                max = Math.max(max, (end - start) * wall);
                if (height[start] < height[end]) {
                    start++;
                } else {
                    end--;
                }
            }
            return max;
        }
    };

    public abstract int maxArea(int[] height);
}
