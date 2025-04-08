package problems201_300;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class ValidAnagramTest extends SampledTest {
    @Test
    public void test() {
        for (ValidAnagram solution : ValidAnagram.values()) {
            for (ValidAnagramSample sample : getSamples(ValidAnagramSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.isAnagram(sample.input.s, sample.input.t))
                    .isEqualTo(sample.output);
            }
        }
    }
}
