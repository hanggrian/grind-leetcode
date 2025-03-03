package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import kotlin.test.Test

class ValidSudokuTest : SampledTest() {
    @Test
    fun test() {
        for (solution in ValidSudoku.entries) {
            for (sample in getSamples(Array<ValidSudokuSample>::class.java)) {
                assertWithMessage(sample.message)
                    .that(solution.isValidSudoku(sample.input!!.board))
                    .isEqualTo(sample.output)
            }
        }
    }
}
