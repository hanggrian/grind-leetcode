import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class RomanToIntegerTest extends SampledTest {
    @Override
    public String getFileName() {
        return "roman_to_integer.json";
    }

    @Test
    public void test() {
        for (TypedSample sample : getSamples(TypedSample[].class)) {
            for (RomanToInteger solution : RomanToInteger.values()) {
                assertWithMessage(sample.getMessage())
                    .that(solution.romanToInt(sample.input.s))
                    .isEqualTo(sample.output);
            }
        }
    }

    public static class TypedSample extends Sample<TypedSample.Input, Integer> {
        public static class Input {
            public String s;
        }
    }
}
