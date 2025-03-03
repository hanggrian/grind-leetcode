package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import kotlin.test.Test

class FindTheIndexOfTheFirstOccurrenceInAStringTest : SampledTest() {
    @Test
    fun test() {
        for (solution in FindTheIndexOfTheFirstOccurrenceInAString.entries) {
            for (
            sample in
            getSamples(Array<FindTheIndexOfTheFirstOccurrenceInAStringSample>::class.java)
            ) {
                assertWithMessage(sample.message)
                    .that(
                        solution.strStr(
                            sample.input!!.haystack,
                            sample.input!!.needle,
                        ),
                    ).isEqualTo(sample.output)
            }
        }
    }
}
