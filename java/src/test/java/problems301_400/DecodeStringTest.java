package problems301_400;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class DecodeStringTest extends SampledTest {
    @Test
    public void test() {
        for (DecodeString solution : DecodeString.values()) {
            for (DecodeStringSample sample : getSamples(DecodeStringSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.decodeString(sample.input.s))
                    .isEqualTo(sample.output);
            }
        }
    }
}
