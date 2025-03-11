package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class ZigzagConversionTest extends SampledTest {
    @Test
    void test() {
        ZigzagConversion.values().each { solution ->
            getSamples(ZigzagConversionSample[].class).each { sample ->
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
