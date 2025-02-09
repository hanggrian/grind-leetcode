package problems1;

import java.util.Arrays;
import java.util.stream.Collectors;
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
        for (ThreeSum solution : ThreeSum.values()) {
            for (TypedSample sample : getSamples(TypedSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.threeSum(sample.input.nums))
                    .containsExactlyElementsIn(
                        Arrays
                            .stream(sample.output)
                            .map(ints -> Arrays.stream(ints).boxed().collect(Collectors.toList()))
                            .collect(Collectors.toList())
                    );
            }
        }
    }

    public static class TypedSample extends Sample<TypedSample.Input, int[][]> {
        public static class Input {
            public int[] nums;
        }
    }
}
