package problems1_100;

import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class TwoSumTest extends SampledTest {
    @Test
    public void test() {
        for (TwoSum solution : TwoSum.values()) {
            for (TypedSample sample : getSamples(TypedSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.twoSum(
                            sample.input.nums,
                            sample.input.target
                        )
                    ).asList()
                    .containsExactlyElementsIn(
                        Arrays
                            .stream(sample.output)
                            .boxed()
                            .collect(Collectors.toList())
                    );
            }
        }
    }

    static class TypedSample extends Sample<TypedSample.Input, int[]> {
        static class Input {
            int[] nums;
            int target;
        }
    }
}
