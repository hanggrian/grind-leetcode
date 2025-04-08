package problems301_400

enum IntersectionOfTwoArrays2 {
    DEFAULT{
        @Override
        int[] intersect(int[] nums1, int[] nums2) {
            Arrays.sort(nums1)
            Arrays.sort(nums2)

            var i = 0
            var j = 0
            ArrayList<Integer> result = []
            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] < nums2[j]) {
                    i++
                } else if (nums1[i] > nums2[j]) {
                    j++
                } else {
                    result.add(nums1[i])
                    i++
                    j++
                }
            }

            var intersect = new int[result.size()]
            for (var k = 0; k < intersect.length; k++) {
                intersect[k] = result.get(k)
            }
            return intersect
        }
    }

    abstract int[] intersect(int[] nums1, int[] nums2)
}
