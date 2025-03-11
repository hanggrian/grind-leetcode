package problems101_200

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class MaximumProductSubarrayTest extends SampledTest {
    @Test
    void test() {
        MaximumProductSubarray.values().each { solution ->
            getSamples(MaximumProductSubarraySample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.maxProduct(sample.input.nums))
                    .isEqualTo(sample.output)
            }
        }
    }
}
