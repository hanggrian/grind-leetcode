package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import testing.SampledTest
import kotlin.test.Test

class ValidParenthesesTest : SampledTest() {
    @Test
    fun test() {
        for (solution in ValidParentheses.entries) {
            for (sample in getSamples(Array<ValidParenthesesSample>::class.java)) {
                assertWithMessage(sample.message)
                    .that(solution.isValid(sample.input!!.s))
                    .isEqualTo(sample.output)
            }
        }
    }
}
