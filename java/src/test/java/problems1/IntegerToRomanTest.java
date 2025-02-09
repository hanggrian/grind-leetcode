package problems1;

import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class IntegerToRomanTest extends SampledTest {
    @Override
    public String getFileName() {
        return "integer_to_roman.json";
    }

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

    public static class TypedSample extends Sample<TypedSample.Input, String> {
        public static class Input {
            public int num;
        }
    }
}
