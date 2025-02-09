package problems1;

import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class StringToIntegerAtoiTest extends SampledTest {
    @Override
    public String getFileName() {
        return "string_to_integer_atoi.json";
    }

    @Test
    public void test() {
        for (StringToIntegerAtoi solution : StringToIntegerAtoi.values()) {
            for (TypedSample sample : getSamples(TypedSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.myAtoi(sample.input.s))
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
