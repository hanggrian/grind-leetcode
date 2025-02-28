package problems1_100

import org.junit.Test
import testing.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class ZigzagConversionTest extends SampledTest {
    @Test
    void test() {
        for (ZigzagConversion solution : ZigzagConversion.values()) {
            for (ZigzagConversionSample sample : getSamples(ZigzagConversionSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.convert(
                            sample.input.s,
                            sample.input.numRows,
                        ),
                    ).isEqualTo(sample.output)
            }
        }
    }
}
