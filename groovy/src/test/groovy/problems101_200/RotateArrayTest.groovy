package problems101_200

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class RotateArrayTest extends SampledTest {
    @Test
    void test() {
        RotateArray.values().each { solution ->
            getSamples(RotateArraySample[].class).each { sample ->
                var nums = sample.input.nums
                solution.rotate(nums, sample.input.k)
                assertWithMessage(sample.getMessage())
                    .that(nums)
                    .isEqualTo(sample.output)
            }
        }
    }
}
