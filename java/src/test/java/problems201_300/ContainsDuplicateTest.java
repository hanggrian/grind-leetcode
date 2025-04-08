package problems201_300;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class ContainsDuplicateTest extends SampledTest {
    @Test
    public void test() {
        for (ContainsDuplicate solution : ContainsDuplicate.values()) {
            for (ContainsDuplicateSample sample : getSamples(ContainsDuplicateSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.containsDuplicate(sample.input.nums))
                    .isEqualTo(sample.output);
            }
        }
    }
}
