package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class MinimumWindowSubstringTest extends SampledTest {
    @Test
    void test() {
        MinimumWindowSubstring.values().each { solution ->
            getSamples(MinimumWindowSubstringSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.minWindow(sample.input.s, sample.input.t))
                    .isEqualTo(sample.output)
            }
        }
    }
}
