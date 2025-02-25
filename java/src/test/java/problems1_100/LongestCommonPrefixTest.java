package problems1_100;

import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class LongestCommonPrefixTest extends SampledTest {
    @Test
    public void test() {
        for (LongestCommonPrefix solution : LongestCommonPrefix.values()) {
            for (TypedSample sample : getSamples(TypedSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.longestCommonPrefix(sample.input.strs))
                    .isEqualTo(sample.output);
            }
        }
    }

    static class TypedSample extends Sample<TypedSample.Input, String> {
        static class Input {
            String[] strs;
        }
    }
}
