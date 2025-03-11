package problems101_200;

import java.util.ArrayList;
import java.util.List;

enum SingleNumber {
    DEFAULT {
        @Override
        int singleNumber(int[] nums) {
            List<Integer> result = new ArrayList<>();
            for (int num : nums) {
                if (!result.contains(num)) {
                    result.add(num);
                } else {
                    result.remove(Integer.valueOf(num));
                }
            }
            return result.get(0);
        }
    };

    abstract int singleNumber(int[] nums);
}
