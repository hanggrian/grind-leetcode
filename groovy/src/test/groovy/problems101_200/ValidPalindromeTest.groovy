package problems101_200

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class ValidPalindromeTest extends SampledTest {
    @Test
    void test() {
        ValidPalindrome.values().each { solution ->
            getSamples(ValidPalindromeSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.isPalindrome(sample.input.s))
                    .isEqualTo(sample.output)
            }
        }
    }
}
