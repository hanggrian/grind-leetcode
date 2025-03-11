package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import kotlin.test.Test

class FindTheIndexOfTheFirstOccurrenceInAStringTest : SampledTest() {
    @Test
    fun test() =
        FindTheIndexOfTheFirstOccurrenceInAString.entries.forEach { solution ->
            getSamples(Array<FindTheIndexOfTheFirstOccurrenceInAStringSample>::class.java)
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(solution.strStr(input.haystack, input.needle))
                        .isEqualTo(output)
                }
        }
}
