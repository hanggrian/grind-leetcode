package problems101_200

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import kotlin.test.Test

class PascalsTriangleTest : SampledTest() {
    @Test
    fun test() =
        PascalsTriangle.entries.forEach { solution ->
            getSamples(Array<PascalsTriangleSample>::class.java)
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(solution.generate(input.numRows))
                        .containsExactlyElementsIn(output.map { it.toList() })
                }
        }
}
