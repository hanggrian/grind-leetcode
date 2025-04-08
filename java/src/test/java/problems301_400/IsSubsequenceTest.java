package problems301_400;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class IsSubsequenceTest extends SampledTest {
    @Test
    public void test() {
        for (IsSubsequence solution : IsSubsequence.values()) {
            for (IsSubsequenceSample sample : getSamples(IsSubsequenceSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.isSubsequence(sample.input.s, sample.input.t))
                    .isEqualTo(sample.output);
            }
        }
    }
}
