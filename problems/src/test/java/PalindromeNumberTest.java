import org.junit.Test;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class PalindromeNumberTest extends SampledTest {
    @Override
    public String getFileName() {
        return "palindrome_number.json";
    }

    @Test
    public void test() {
        for (Sample sample : getSamples(Sample[].class)) {
            for (PalindromeNumber solution : PalindromeNumber.values()) {
                assertWithMessage(sample.explanation)
                    .that(solution.isPalindrome(sample.input))
                    .isEqualTo(sample.output);
            }
        }
    }

    public static class Sample {
        public int input;
        public boolean output;
        public String explanation;
    }
}
