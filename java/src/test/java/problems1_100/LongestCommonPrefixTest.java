package problems1_100;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class LongestCommonPrefixTest extends SampledTest {
    @Test
    public void test() {
        for (LongestCommonPrefix solution : LongestCommonPrefix.values()) {
            for (LongestCommonPrefixSample sample : getSamples(LongestCommonPrefixSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.longestCommonPrefix(sample.input.strs))
                    .isEqualTo(sample.output);
            }
        }
    }
}
