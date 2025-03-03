package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class ReverseIntegerTest extends SampledTest {
    @Test
    void test() {
        for (ReverseInteger solution : ReverseInteger.values()) {
            for (ReverseIntegerSample sample : getSamples(ReverseIntegerSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.reverse(sample.input.x))
                    .isEqualTo(sample.output)
            }
        }
    }
}
