package problems1_100

import org.junit.Test
import testing.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class ValidSudokuTest extends SampledTest {
    @Test
    void test() {
        for (ValidSudoku solution : ValidSudoku.values()) {
            for (ValidSudokuSample sample : getSamples(ValidSudokuSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.isValidSudoku(sample.input.board))
                    .isEqualTo(sample.output)
            }
        }
    }
}
