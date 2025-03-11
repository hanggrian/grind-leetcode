package problems101_200

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class WordLadderTest extends SampledTest {
    @Test
    void test() {
        WordLadder.values().each { solution ->
            getSamples(WordLadderSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.ladderLength(
                            sample.input.beginWord,
                            sample.input.endWord,
                            Arrays.asList(sample.input.wordList),
                        ),
                    ).isEqualTo(sample.output)
            }
        }
    }
}
