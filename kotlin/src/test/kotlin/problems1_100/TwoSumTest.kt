package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import kotlin.test.Test

class TwoSumTest : SampledTest() {
    @Test
    fun test() {
        for (solution in TwoSum.entries) {
            for (sample in getSamples(Array<TwoSumSample>::class.java)) {
                assertWithMessage(sample.message)
                    .that(
                        solution.twoSum(
                            sample.input!!.nums,
                            sample.input!!.target,
                        ),
                    ).asList()
                    .containsExactlyElementsIn(
                        sample.output!!
                            .toList(),
                    )
            }
        }
    }
}
