package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class MergeSortedArrayTest : SampledTest() {
    @Test
    fun test() =
        MergeSortedArray.entries.forEach { solution ->
            getSamples<Array<MergeSortedArraySample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(input.nums1.also { solution.merge(it, input.m, input.nums2, input.n) })
                    .asList()
                    .containsExactlyElementsIn(output.toList())
                    .inOrder()
            }
        }
}
