package problems1;

import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class ZigzagConversionTest extends SampledTest {
    @Override
    public String getFileName() {
        return "zigzag_conversion.json";
    }

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

    public static class TypedSample extends Sample<TypedSample.Input, String> {
        public static class Input {
            public String s;
            public int numRows;
        }
    }
}
