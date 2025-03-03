package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class IntegerToRomanTest extends SampledTest {
    @Test
    void test() {
        for (IntegerToRoman solution : IntegerToRoman.values()) {
            for (IntegerToRomanSample sample : getSamples(IntegerToRomanSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.intToRoman(sample.input.num))
                    .isEqualTo(sample.output)
            }
        }
    }
}
