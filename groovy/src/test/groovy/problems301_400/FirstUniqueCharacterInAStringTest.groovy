package problems301_400

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class FirstUniqueCharacterInAStringTest extends SampledTest {
    @Test
    void test() {
        FirstUniqueCharacterInAString.values().each { solution ->
            getSamples(FirstUniqueCharacterInAStringSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.firstUniqChar(sample.input.s))
                    .isEqualTo(sample.output)
            }
        }
    }
}
