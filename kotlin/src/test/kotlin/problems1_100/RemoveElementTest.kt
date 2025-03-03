package problems1_100

import com.google.common.truth.Truth.assertThat
import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import kotlin.test.Test

class RemoveElementTest : SampledTest() {
    @Test
    fun test() {
        for (solution in RemoveElement.entries) {
            for (sample in getSamples(Array<RemoveElementSample>::class.java)) {
                assertWithMessage(sample.message)
                    .that(
                        solution.removeElement(
                            sample.input!!.nums,
                            sample.input!!.`val`,
                        ),
                    ).isEqualTo(sample.output)
                assertThat(
                    sample.input!!
                        .nums
                        .toList()
                        .subList(0, sample.output!!),
                ).doesNotContain(sample.input!!.`val`)
            }
        }
    }
}
