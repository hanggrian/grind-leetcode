package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import testing.SampledTest
import kotlin.test.Test

class ZigzagConversionTest : SampledTest() {
    @Test
    fun test() {
        for (solution in ZigzagConversion.entries) {
            for (sample in getSamples(Array<ZigzagConversionSample>::class.java)) {
                assertWithMessage(sample.message)
                    .that(
                        solution.convert(
                            sample.input!!.s,
                            sample.input!!.numRows,
                        ),
                    ).isEqualTo(sample.output)
            }
        }
    }
}
