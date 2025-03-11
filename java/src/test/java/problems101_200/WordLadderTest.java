package problems101_200;

import java.util.Arrays;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class WordLadderTest extends SampledTest {
    @Test
    public void test() {
        for (WordLadder solution : WordLadder.values()) {
            for (WordLadderSample sample : getSamples(WordLadderSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.ladderLength(
                            sample.input.beginWord,
                            sample.input.endWord,
                            Arrays.asList(sample.input.wordList)
                        )
                    ).isEqualTo(sample.output);
            }
        }
    }
}
