package problems101_200

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class FindPeakElementTest extends SampledTest {
    @Test
    void test() {
        FindPeakElement.values().each { solution ->
            getSamples(FindPeakElementSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.findPeakElement(sample.input.nums))
                    .isEqualTo(sample.input.nums[sample.output])
            }
        }
    }
}
