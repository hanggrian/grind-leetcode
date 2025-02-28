package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import testing.SampledTest
import kotlin.test.Test

class RomanToIntegerTest : SampledTest() {
    @Test
    fun test() {
        for (solution in RomanToInteger.entries) {
            for (sample in getSamples(Array<RomanToIntegerSample>::class.java)) {
                assertWithMessage(sample.message)
                    .that(solution.romanToInt(sample.input!!.s))
                    .isEqualTo(sample.output)
            }
        }
    }
}
