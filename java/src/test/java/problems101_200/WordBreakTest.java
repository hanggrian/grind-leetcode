package problems101_200;

import java.util.Arrays;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class WordBreakTest extends SampledTest {
    @Test
    public void test() {
        for (WordBreak solution : WordBreak.values()) {
            for (WordBreakSample sample : getSamples(WordBreakSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.wordBreak(sample.input.s, Arrays.asList(sample.input.wordDict)))
                    .isEqualTo(sample.output);
            }
        }
    }
}
