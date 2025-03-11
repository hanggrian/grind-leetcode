package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import kotlin.test.Test

class PalindromeNumberTest : SampledTest() {
    @Test
    fun test() =
        PalindromeNumber.entries.forEach { solution ->
            getSamples(Array<PalindromeNumberSample>::class.java)
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(solution.isPalindrome(input.x))
                        .isEqualTo(output)
                }
        }
}
