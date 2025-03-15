package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class ValidParenthesesTest : SampledTest() {
    @Test
    fun test() =
        ValidParentheses.entries.forEach { solution ->
            getSamples<Array<ValidParenthesesSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.isValid(input.s))
                    .isEqualTo(output)
            }
        }
}
