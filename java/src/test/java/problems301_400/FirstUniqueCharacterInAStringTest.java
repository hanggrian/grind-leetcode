package problems301_400;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class FirstUniqueCharacterInAStringTest extends SampledTest {
    @Test
    public void test() {
        for (FirstUniqueCharacterInAString solution : FirstUniqueCharacterInAString.values()) {
            for (FirstUniqueCharacterInAStringSample sample
                : getSamples(FirstUniqueCharacterInAStringSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.firstUniqChar(sample.input.s))
                    .isEqualTo(sample.output);
            }
        }
    }
}
