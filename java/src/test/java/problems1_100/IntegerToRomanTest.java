package problems1_100;

import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class IntegerToRomanTest extends SampledTest {
    @Test
    public void test() {
        for (IntegerToRoman solution : IntegerToRoman.values()) {
            for (TypedSample sample : getSamples(TypedSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.intToRoman(sample.input.num))
                    .isEqualTo(sample.output);
            }
        }
    }

    static class TypedSample extends Sample<TypedSample.Input, String> {
        static class Input {
            int num;
        }
    }
}
