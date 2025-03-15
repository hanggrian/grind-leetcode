package problems101_200

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class WordBreakTest extends SampledTest {
    @Test
    void test() {
        WordBreak.values().each { solution ->
            getSamples(WordBreakSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.wordBreak(sample.input.s, sample.input.wordDict.toList()))
                    .isEqualTo(sample.output)
            }
        }
    }
}
