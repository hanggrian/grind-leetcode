package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import kotlin.test.Test

class PalindromeNumberTest : SampledTest() {
    @Test
    fun test() {
        for (solution in PalindromeNumber.entries) {
            for (sample in getSamples(Array<PalindromeNumberSample>::class.java)) {
                assertWithMessage(sample.message)
                    .that(solution.isPalindrome(sample.input!!.x))
                    .isEqualTo(sample.output)
            }
        }
    }
}
