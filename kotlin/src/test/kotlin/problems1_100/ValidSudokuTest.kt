package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class ValidSudokuTest : SampledTest() {
    @Test
    fun test() =
        ValidSudoku.entries.forEach { solution ->
            getSamples<Array<ValidSudokuSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.isValidSudoku(input.board))
                    .isEqualTo(output)
            }
        }
}
