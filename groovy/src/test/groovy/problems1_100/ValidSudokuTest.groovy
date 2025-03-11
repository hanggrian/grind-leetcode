package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class ValidSudokuTest extends SampledTest {
    @Test
    void test() {
        ValidSudoku.values().each { solution ->
            getSamples(ValidSudokuSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.isValidSudoku(sample.input.board))
                    .isEqualTo(sample.output)
            }
        }
    }
}
