package problems1_100

import org.junit.Test
import testing.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class StringToIntegerAtoiTest extends SampledTest {
    @Test
    void test() {
        for (StringToIntegerAtoi solution : StringToIntegerAtoi.values()) {
            for (StringToIntegerAtoiSample sample : getSamples(StringToIntegerAtoiSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.myAtoi(sample.input.s))
                    .isEqualTo(sample.output)
            }
        }
    }
}
