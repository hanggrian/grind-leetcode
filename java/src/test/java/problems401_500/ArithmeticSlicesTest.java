package problems401_500;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class ArithmeticSlicesTest extends SampledTest {
    @Test
    public void test() {
        for (ArithmeticSlices solution : ArithmeticSlices.values()) {
            for (ArithmeticSlicesSample sample : getSamples(ArithmeticSlicesSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.numberOfArithmeticSlices(sample.input.nums))
                    .isEqualTo(sample.output);
            }
        }
    }
}
