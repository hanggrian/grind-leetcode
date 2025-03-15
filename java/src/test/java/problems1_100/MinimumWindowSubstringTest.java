package problems1_100;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class MinimumWindowSubstringTest extends SampledTest {
    @Test
    public void test() {
        for (MinimumWindowSubstring solution : MinimumWindowSubstring.values()) {
            for (MinimumWindowSubstringSample sample
                : getSamples(MinimumWindowSubstringSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.minWindow(sample.input.s, sample.input.t))
                    .isEqualTo(sample.output);
            }
        }
    }
}
