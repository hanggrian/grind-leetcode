import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.Test;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class TwoSumTest extends SampledTest {
    @Override
    public String getFileName() {
        return "two_sum.json";
    }

    @Test
    public void test() {
        for (Sample sample : getSamples(Sample[].class)) {
            for (TwoSum solution : TwoSum.values()) {
                assertWithMessage(sample.explanation)
                    .that(solution.twoSum(sample.input.nums, sample.input.target))
                    .asList()
                    .containsExactlyElementsIn(
                        Arrays.stream(sample.output).boxed().collect(Collectors.toList())
                    );
            }
        }
    }

    public static class Sample {
        public Input input;
        public int[] output;
        public String explanation;

        public static class Input {
            public int[] nums;
            public int target;
        }
    }
}
