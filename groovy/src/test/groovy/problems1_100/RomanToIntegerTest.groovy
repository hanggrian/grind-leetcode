package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class RomanToIntegerTest extends SampledTest {
    @Test
    void test() {
        for (RomanToInteger solution : RomanToInteger.values()) {
            for (RomanToIntegerSample sample : getSamples(RomanToIntegerSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.romanToInt(sample.input.s))
                    .isEqualTo(sample.output)
            }
        }
    }
}
