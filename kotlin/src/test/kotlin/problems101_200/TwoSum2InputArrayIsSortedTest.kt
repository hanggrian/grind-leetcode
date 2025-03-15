package problems101_200

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class TwoSum2InputArrayIsSortedTest : SampledTest() {
    override fun getSampleFilename(): String = "two-sum-ii-input-array-is-sorted.json"

    @Test
    fun test() =
        TwoSum2InputArrayIsSorted.entries.forEach { solution ->
            getSamples<Array<TwoSum2InputArrayIsSortedSample>>()
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(solution.twoSum(input.numbers, input.target))
                        .isEqualTo(output)
                }
        }
}
