package problems1_100;

import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class ValidSudokuTest extends SampledTest {
    @Test
    public void test() {
        for (ValidSudoku solution : ValidSudoku.values()) {
            for (TypedSample sample : getSamples(TypedSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.isValidSudoku(sample.input.board))
                    .isEqualTo(sample.output);
            }
        }
    }

    static class TypedSample extends Sample<TypedSample.Input, Boolean> {
        static class Input {
            char[][] board;
        }
    }
}
