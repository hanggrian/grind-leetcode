package problems101_200

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class PascalsTriangle2Test : SampledTest() {
    override fun getSampleFilename(): String = "pascals-triangle-ii.json"

    @Test
    fun test() =
        PascalsTriangle2.entries.forEach { solution ->
            getSamples<Array<PascalsTriangle2Sample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.getRow(input.rowIndex))
                    .containsExactlyElementsIn(output.toList())
                    .inOrder()
            }
        }
}
