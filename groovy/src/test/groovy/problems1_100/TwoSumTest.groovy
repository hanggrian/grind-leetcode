package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class TwoSumTest extends SampledTest {
    @Test
    void test() {
        for (TwoSum solution : TwoSum.values()) {
            for (TwoSumSample sample : getSamples(TwoSumSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.twoSum(
                            sample.input.nums,
                            sample.input.target,
                        ),
                    ).asList()
                    .containsExactlyElementsIn(
                        Arrays
                            .stream(sample.output)
                            .boxed()
                            .toList(),
                    )
            }
        }
    }
}
