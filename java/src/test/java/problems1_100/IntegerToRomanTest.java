package problems1_100;

import org.junit.Test;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class IntegerToRomanTest extends SampledTest {
    @Test
    public void test() {
        for (IntegerToRoman solution : IntegerToRoman.values()) {
            for (IntegerToRomanSample sample : getSamples(IntegerToRomanSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.intToRoman(sample.input.num))
                    .isEqualTo(sample.output);
            }
        }
    }
}
