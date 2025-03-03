package problems1_100;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class ZigzagConversionTest extends SampledTest {
    @Test
    public void test() {
        for (ZigzagConversion solution : ZigzagConversion.values()) {
            for (ZigzagConversionSample sample : getSamples(ZigzagConversionSample[].class)) {
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
}
