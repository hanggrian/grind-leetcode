package problems101_200

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class TriangleTest : SampledTest() {
    @Test
    fun test() =
        Triangle.entries.forEach { solution ->
            getSamples<Array<TriangleSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.minimumTotal(input.triangle.map { it.toList() }))
                    .isEqualTo(output)
            }
        }
}
