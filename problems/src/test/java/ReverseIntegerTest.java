import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class ReverseIntegerTest extends SampledTest {
    @Override
    public String getFileName() {
        return "reverse_integer.json";
    }

    @Test
    public void test() {
        for (TypedSample sample : getSamples(TypedSample[].class)) {
            for (ReverseInteger solution : ReverseInteger.values()) {
                assertWithMessage(sample.getMessage())
                    .that(solution.reverse(sample.input.x))
                    .isEqualTo(sample.output);
            }
        }
    }

    public static class TypedSample extends Sample<TypedSample.Input, Integer> {
        public static class Input {
            public int x;
        }
    }
}
