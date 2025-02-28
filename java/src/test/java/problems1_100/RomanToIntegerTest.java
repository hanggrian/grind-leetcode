package problems1_100;

import org.junit.Test;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class RomanToIntegerTest extends SampledTest {
    @Test
    public void test() {
        for (RomanToInteger solution : RomanToInteger.values()) {
            for (RomanToIntegerSample sample : getSamples(RomanToIntegerSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.romanToInt(sample.input.s))
                    .isEqualTo(sample.output);
            }
        }
    }
}
