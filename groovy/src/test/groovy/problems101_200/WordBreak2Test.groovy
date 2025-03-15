package problems101_200

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class WordBreak2Test extends SampledTest {
    @Override
    protected String getSampleFilename() {
        return 'word-break-ii.json'
    }

    @Test
    void test() {
        WordBreak2.values().each { solution ->
            getSamples(WordBreak2Sample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.wordBreak(sample.input.s, sample.input.wordDict.toList()))
                    .containsExactlyElementsIn(sample.output)
            }
        }
    }
}
