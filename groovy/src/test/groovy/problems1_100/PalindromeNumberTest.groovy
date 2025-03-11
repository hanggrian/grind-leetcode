package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class PalindromeNumberTest extends SampledTest {
    @Test
    void test() {
        PalindromeNumber.values().each { solution ->
            getSamples(PalindromeNumberSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.isPalindrome(sample.input.x))
                    .isEqualTo(sample.output)
            }
        }
    }
}
