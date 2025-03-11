package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import kotlin.test.Test

class SearchA2dMatrixTest : SampledTest() {
    override fun getSampleFilename(): String = "search-a-2d-matrix.json"

    @Test
    fun test() =
        SearchA2dMatrix.entries.forEach { solution ->
            getSamples(Array<SearchA2dMatrixSample>::class.java)
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(solution.searchMatrix(input.matrix, input.target))
                        .isEqualTo(output)
                }
        }
}
