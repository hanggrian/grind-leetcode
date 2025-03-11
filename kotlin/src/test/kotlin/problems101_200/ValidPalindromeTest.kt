package problems101_200

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import kotlin.test.Test

class ValidPalindromeTest : SampledTest() {
    @Test
    fun test() =
        ValidPalindrome.entries.forEach { solution ->
            getSamples(Array<ValidPalindromeSample>::class.java)
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(solution.isPalindrome(input.s))
                        .isEqualTo(output)
                }
        }
}
