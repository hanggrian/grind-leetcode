package problems1_100

enum TrappingRainWater {
    DEFAULT{
        @Override
        int trap(int[] height) {
            if (height.length < 3) {
                return 0
            }

            // create two arrays of increasing height for each end
            var ltrHeight = new int[height.length]
            var rtlHeight = new int[height.length]
            ltrHeight[0] = height[0]
            rtlHeight[height.length - 1] = height[-1]
            for (var i = 1; i < height.length; i++) {
                ltrHeight[i] = Math.max(ltrHeight[i - 1], height[i])
            }
            for (var i = height.length - 2; i >= 0; i--) {
                rtlHeight[i] = Math.max(rtlHeight[i + 1], height[i])
            }

            // the overlap between two heights is the water
            int water = 0
            for (var i = 0; i < height.length; i++) {
                water += Math.min(ltrHeight[i], rtlHeight[i]) - height[i]
            }
            return water
        }
    }

    abstract int trap(int[] height)
}
