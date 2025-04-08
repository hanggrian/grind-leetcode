package problems201_300

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class ValidAnagramTest extends SampledTest {
    @Test
    void test() {
        ValidAnagram.values().each { solution ->
            getSamples(ValidAnagramSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.isAnagram(sample.input.s, sample.input.t))
                    .isEqualTo(sample.output)
            }
        }
    }
}
