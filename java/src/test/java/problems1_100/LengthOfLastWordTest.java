package problems1_100;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class LengthOfLastWordTest extends SampledTest {
    @Test
    public void test() {
        for (LengthOfLastWord solution : LengthOfLastWord.values()) {
            for (LengthOfLastWordSample sample : getSamples(LengthOfLastWordSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.lengthOfLastWord(sample.input.s))
                    .isEqualTo(sample.output);
            }
        }
    }
}
