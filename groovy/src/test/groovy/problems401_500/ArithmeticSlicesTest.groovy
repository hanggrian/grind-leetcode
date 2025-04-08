package problems401_500

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class ArithmeticSlicesTest extends SampledTest {
    @Test
    void test() {
        ArithmeticSlices.values().each { solution ->
            getSamples(ArithmeticSlicesSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.numberOfArithmeticSlices(sample.input.nums))
                    .isEqualTo(sample.output)
            }
        }
    }
}
