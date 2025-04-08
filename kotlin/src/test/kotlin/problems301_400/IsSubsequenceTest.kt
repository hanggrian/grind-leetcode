package problems301_400

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class IsSubsequenceTest : SampledTest() {
    @Test
    fun test() =
        IsSubsequence.entries.forEach { solution ->
            getSamples<Array<IsSubsequenceSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.isSubsequence(input.s, input.t))
                    .isEqualTo(output)
            }
        }
}
