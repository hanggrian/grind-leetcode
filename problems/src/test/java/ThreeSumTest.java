import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class ThreeSumTest extends SampledTest {
    @Override
    public String getFileName() {
        return "three_sum.json";
    }

    @Test
    public void test() {
        for (TypedSample sample : getSamples(TypedSample[].class)) {
            List<List<Integer>> output = new ArrayList<>(sample.output.length);
            for (int[] entry : sample.output) {
                output.add(Arrays.stream(entry).boxed().toList());
            }
            for (ThreeSum solution : ThreeSum.values()) {
                assertWithMessage(sample.getMessage())
                    .that(solution.threeSum(sample.input.nums))
                    .containsExactlyElementsIn(output);
            }
        }
    }

    public static class TypedSample extends Sample<TypedSample.Input, int[][]> {
        public static class Input {
            public int[] nums;
        }
    }
}
