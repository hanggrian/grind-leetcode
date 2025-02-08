import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class LongestCommonPrefixTest extends SampledTest {
    @Override
    public String getFileName() {
        return "longest_common_prefix.json";
    }

    @Test
    public void test() {
        for (TypedSample sample : getSamples(TypedSample[].class)) {
            for (LongestCommonPrefix solution : LongestCommonPrefix.values()) {
                assertWithMessage(sample.getMessage())
                    .that(solution.longestCommonPrefix(sample.input.strs))
                    .isEqualTo(sample.output);
            }
        }
    }

    public static class TypedSample extends Sample<TypedSample.Input, String> {
        public static class Input {
            public String[] strs;
        }
    }
}
