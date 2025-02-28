package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import testing.SampledTest
import kotlin.test.Test

class SearchInsertPositionTest : SampledTest() {
    @Test
    fun test() {
        for (solution in SearchInsertPosition.entries) {
            for (sample in getSamples(Array<SearchInsertPositionSample>::class.java)) {
                assertWithMessage(sample.message)
                    .that(
                        solution.searchInsert(
                            sample.input!!.nums,
                            sample.input!!.target,
                        ),
                    ).isEqualTo(sample.output)
            }
        }
    }
}
