package problems201_300

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class ValidAnagramTest : SampledTest() {
    @Test
    fun test() =
        ValidAnagram.entries.forEach { solution ->
            getSamples<Array<ValidAnagramSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.isAnagram(input.s, input.t))
                    .isEqualTo(output)
            }
        }
}
