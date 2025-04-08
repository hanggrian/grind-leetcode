package problems201_300;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class UglyNumberTest extends SampledTest {
    @Test
    public void test() {
        for (UglyNumber solution : UglyNumber.values()) {
            for (UglyNumberSample sample : getSamples(UglyNumberSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.isUgly(sample.input.n))
                    .isEqualTo(sample.output);
            }
        }
    }
}
