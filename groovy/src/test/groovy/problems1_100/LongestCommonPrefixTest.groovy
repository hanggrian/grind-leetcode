package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class LongestCommonPrefixTest extends SampledTest {
    @Test
    void test() {
        LongestCommonPrefix.values().each { solution ->
            getSamples(LongestCommonPrefixSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.longestCommonPrefix(sample.input.strs))
                    .isEqualTo(sample.output)
            }
        }
    }
}
