package problems101_200;

import java.util.Arrays;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class WordBreak2Test extends SampledTest {
    @Override
    protected String getSampleFilename() {
        return "word-break-ii.json";
    }

    @Test
    public void test() {
        for (WordBreak2 solution : WordBreak2.values()) {
            for (WordBreak2Sample sample : getSamples(WordBreak2Sample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.wordBreak(sample.input.s, Arrays.asList(sample.input.wordDict)))
                    .containsExactlyElementsIn(sample.output);
            }
        }
    }
}
