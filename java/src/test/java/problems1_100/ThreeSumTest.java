package problems1_100;

import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class ThreeSumTest extends SampledTest {
    @Test
    public void test() {
        for (ThreeSum solution : ThreeSum.values()) {
            for (ThreeSumSample sample : getSamples(ThreeSumSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.threeSum(sample.input.nums))
                    .containsExactlyElementsIn(
                        Arrays
                            .stream(sample.output)
                            .map(ints ->
                                Arrays
                                    .stream(ints)
                                    .boxed()
                                    .collect(Collectors.toList())
                            ).toList()
                    ).inOrder();
            }
        }
    }
}
