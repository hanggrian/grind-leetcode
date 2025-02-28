package problems1_100

import com.google.common.truth.Truth.assertThat
import com.google.common.truth.Truth.assertWithMessage
import testing.SampledTest
import kotlin.test.Test

class RemoveDuplicatesFromSortedArrayTest : SampledTest() {
    @Test
    fun test() {
        for (solution in RemoveDuplicatesFromSortedArray.entries) {
            for (sample in getSamples(Array<RemoveDuplicatesFromSortedArraySample>::class.java)) {
                assertWithMessage(sample.message)
                    .that(solution.removeDuplicates(sample.input!!.nums))
                    .isEqualTo(sample.output)
                assertThat(
                    sample.input!!
                        .nums
                        .toList()
                        .subList(0, sample.output!!),
                ).containsNoDuplicates()
            }
        }
    }
}
