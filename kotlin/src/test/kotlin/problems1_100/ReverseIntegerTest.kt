package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import testing.SampledTest
import kotlin.test.Test

class ReverseIntegerTest : SampledTest() {
    @Test
    fun test() {
        for (solution in ReverseInteger.entries) {
            for (sample in getSamples(Array<ReverseIntegerSample>::class.java)) {
                assertWithMessage(sample.message)
                    .that(solution.reverse(sample.input!!.x))
                    .isEqualTo(sample.output)
            }
        }
    }
}
