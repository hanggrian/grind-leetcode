package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class RomanToIntegerTest extends SampledTest {
    @Test
    void test() {
        RomanToInteger.values().each { solution ->
            getSamples(RomanToIntegerSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.romanToInt(sample.input.s))
                    .isEqualTo(sample.output)
            }
        }
    }
}
