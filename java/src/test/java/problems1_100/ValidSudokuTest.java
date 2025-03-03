package problems1_100;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class ValidSudokuTest extends SampledTest {
    @Test
    public void test() {
        for (ValidSudoku solution : ValidSudoku.values()) {
            for (ValidSudokuSample sample : getSamples(ValidSudokuSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.isValidSudoku(sample.input.board))
                    .isEqualTo(sample.output);
            }
        }
    }
}
