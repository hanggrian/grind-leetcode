package problems1_100;

import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class RomanToIntegerTest extends SampledTest {
    @Test
    public void test() {
        for (RomanToInteger solution : RomanToInteger.values()) {
            for (TypedSample sample : getSamples(TypedSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.romanToInt(sample.input.s))
                    .isEqualTo(sample.output);
            }
        }
    }

    static class TypedSample extends Sample<TypedSample.Input, Integer> {
        static class Input {
            String s;
        }
    }
}
