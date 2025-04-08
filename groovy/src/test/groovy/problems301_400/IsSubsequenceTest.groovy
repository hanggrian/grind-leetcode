package problems301_400

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class IsSubsequenceTest extends SampledTest {
    @Test
    void test() {
        IsSubsequence.values().each { solution ->
            getSamples(IsSubsequenceSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.isSubsequence(sample.input.s, sample.input.t))
                    .isEqualTo(sample.output)
            }
        }
    }
}
