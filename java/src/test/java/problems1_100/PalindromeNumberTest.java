package problems1_100;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class PalindromeNumberTest extends SampledTest {
    @Test
    public void test() {
        for (PalindromeNumber solution : PalindromeNumber.values()) {
            for (PalindromeNumberSample sample : getSamples(PalindromeNumberSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.isPalindrome(sample.input.x))
                    .isEqualTo(sample.output);
            }
        }
    }
}
