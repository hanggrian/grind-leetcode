package problems101_200;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class SingleNumberTest extends SampledTest {
    @Test
    public void test() {
        for (SingleNumber solution : SingleNumber.values()) {
            for (SingleNumberSample sample : getSamples(SingleNumberSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.singleNumber(sample.input.nums))
                    .isEqualTo(sample.output);
            }
        }
    }
}
