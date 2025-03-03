package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import kotlin.test.Test

class IntegerToRomanTest : SampledTest() {
    @Test
    fun test() {
        for (solution in IntegerToRoman.entries) {
            for (sample in getSamples(Array<IntegerToRomanSample>::class.java)) {
                assertWithMessage(sample.message)
                    .that(solution.intToRoman(sample.input!!.num))
                    .isEqualTo(sample.output)
            }
        }
    }
}
