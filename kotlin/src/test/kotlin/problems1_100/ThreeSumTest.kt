package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import testing.SampledTest
import kotlin.test.Test

class ThreeSumTest : SampledTest() {
    @Test
    fun test() {
        for (solution in ThreeSum.entries) {
            for (sample in getSamples(Array<ThreeSumSample>::class.java)) {
                assertWithMessage(sample.message)
                    .that(solution.threeSum(sample.input!!.nums))
                    .containsExactlyElementsIn(
                        sample.output
                            .map { it.toList() }
                            .toList(),
                    )
            }
        }
    }
}
