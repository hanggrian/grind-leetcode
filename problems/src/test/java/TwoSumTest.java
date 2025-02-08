import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class TwoSumTest extends SampledTest {
    @Override
    public String getFileName() {
        return "two_sum.json";
    }

    @Test
    public void test() {
        for (TypedSample sample : getSamples(TypedSample[].class)) {
            List<Integer> output = Arrays.stream(sample.output).boxed().toList();
            for (TwoSum solution : TwoSum.values()) {
                assertWithMessage(sample.getMessage())
                    .that(solution.twoSum(sample.input.nums, sample.input.target))
                    .asList()
                    .containsExactlyElementsIn(output);
            }
        }
    }

    public static class TypedSample extends Sample<TypedSample.Input, int[]> {
        public static class Input {
            public int[] nums;
            public int target;
        }
    }
}
