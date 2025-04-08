package problems301_400

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class DecodeStringTest extends SampledTest {
    @Test
    void test() {
        DecodeString.values().each { solution ->
            getSamples(DecodeStringSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.decodeString(sample.input.s))
                    .isEqualTo(sample.output)
            }
        }
    }
}
