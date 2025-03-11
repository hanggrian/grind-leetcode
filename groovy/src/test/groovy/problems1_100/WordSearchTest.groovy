package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class WordSearchTest extends SampledTest {
    @Test
    void test() {
        WordSearch.values().each { solution ->
            getSamples(WordSearchSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.exist(sample.input.board, sample.input.word))
                    .isEqualTo(sample.output)
            }
        }
    }
}
