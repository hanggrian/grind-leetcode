package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import kotlin.test.Test

class StringToIntegerAtoiTest : SampledTest() {
    @Test
    fun test() {
        for (solution in StringToIntegerAtoi.entries) {
            for (sample in getSamples(Array<StringToIntegerAtoiSample>::class.java)) {
                assertWithMessage(sample.message)
                    .that(solution.myAtoi(sample.input!!.s))
                    .isEqualTo(sample.output)
            }
        }
    }
}
