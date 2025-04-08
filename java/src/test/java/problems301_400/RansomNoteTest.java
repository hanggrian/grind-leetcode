package problems301_400;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class RansomNoteTest extends SampledTest {
    @Test
    public void test() {
        for (RansomNote solution : RansomNote.values()) {
            for (RansomNoteSample sample : getSamples(RansomNoteSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.canConstruct(sample.input.ransomNote, sample.input.magazine))
                    .isEqualTo(sample.output);
            }
        }
    }
}
