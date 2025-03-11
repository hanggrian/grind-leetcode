package problems1_100;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class WordSearchTest extends SampledTest {
    @Test
    public void test() {
        for (WordSearch solution : WordSearch.values()) {
            for (WordSearchSample sample : getSamples(WordSearchSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.exist(sample.input.board, sample.input.word))
                    .isEqualTo(sample.output);
            }
        }
    }
}
