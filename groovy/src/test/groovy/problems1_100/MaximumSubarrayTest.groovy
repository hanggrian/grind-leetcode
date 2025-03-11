package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class MaximumSubarrayTest extends SampledTest {
    @Test
    void test() {
        MaximumSubarray.values().each { solution ->
            getSamples(MaximumSubarraySample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.maxSubArray(sample.input.nums))
                    .isEqualTo(sample.output)
            }
        }
    }
}
