package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class SortColorsTest : SampledTest() {
    @Test
    fun test() =
        SortColors.entries.forEach { solution ->
            getSamples<Array<SortColorsSample>>().forEach { (input, output, message) ->
                val nums = input.nums
                solution.sortColors(nums)
                assertWithMessage(message)
                    .that(nums)
                    .asList()
                    .containsExactlyElementsIn(output.toList())
                    .inOrder()
            }
        }
}
