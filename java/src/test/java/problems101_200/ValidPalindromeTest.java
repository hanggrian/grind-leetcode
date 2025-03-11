package problems101_200;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class ValidPalindromeTest extends SampledTest {
    @Test
    public void test() {
        for (ValidPalindrome solution : ValidPalindrome.values()) {
            for (ValidPalindromeSample sample : getSamples(ValidPalindromeSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.isPalindrome(sample.input.s))
                    .isEqualTo(sample.output);
            }
        }
    }
}
