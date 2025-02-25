package problems1_100;

import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class ZigzagConversionTest extends SampledTest {
    @Test
    public void test() {
        for (ZigzagConversion solution : ZigzagConversion.values()) {
            for (TypedSample sample : getSamples(TypedSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.convert(
                            sample.input.s,
                            sample.input.numRows
                        )
                    ).isEqualTo(sample.output);
            }
        }
    }

    static class TypedSample extends Sample<TypedSample.Input, String> {
        static class Input {
            String s;
            int numRows;
        }
    }
}
