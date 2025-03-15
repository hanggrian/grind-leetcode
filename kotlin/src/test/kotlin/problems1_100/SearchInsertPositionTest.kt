package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class SearchInsertPositionTest : SampledTest() {
    @Test
    fun test() =
        SearchInsertPosition.entries.forEach { solution ->
            getSamples<Array<SearchInsertPositionSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.searchInsert(input.nums, input.target))
                    .isEqualTo(output)
            }
        }
}
