package problems301_400

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class IntersectionOfTwoArrays2Test : SampledTest() {
    override fun getSampleFilename(): String = "intersection-of-two-arrays-ii.json"

    @Test
    fun test() =
        IntersectionOfTwoArrays2.entries.forEach { solution ->
            getSamples<Array<IntersectionOfTwoArrays2Sample>>()
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(solution.intersect(input.nums1, input.nums2))
                        .asList()
                        .containsExactlyElementsIn(output.toList())
                }
        }
}
