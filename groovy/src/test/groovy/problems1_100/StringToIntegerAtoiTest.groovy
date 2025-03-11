package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class StringToIntegerAtoiTest extends SampledTest {
    @Test
    void test() {
        StringToIntegerAtoi.values().each { solution ->
            getSamples(StringToIntegerAtoiSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.myAtoi(sample.input.s))
                    .isEqualTo(sample.output)
            }
        }
    }
}
