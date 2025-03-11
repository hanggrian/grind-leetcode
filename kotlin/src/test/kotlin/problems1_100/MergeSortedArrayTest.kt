package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import kotlin.test.Test

class MergeSortedArrayTest : SampledTest() {
    @Test
    fun test() =
        MergeSortedArray.entries.forEach { solution ->
            getSamples(Array<MergeSortedArraySample>::class.java)
                .forEach { (input, output, message) ->
                    val nums1 = input.nums1
                    val nums2 = input.nums2
                    solution.merge(nums1, input.m, nums2, input.n)
                    assertWithMessage(message)
                        .that(nums1)
                        .asList()
                        .containsExactlyElementsIn(output.toList())
                }
        }
}
