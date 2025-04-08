package problems201_300

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class ContainsDuplicateTest extends SampledTest {
    @Test
    void test() {
        ContainsDuplicate.values().each { solution ->
            getSamples(ContainsDuplicateSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.containsDuplicate(sample.input.nums))
                    .isEqualTo(sample.output)
            }
        }
    }
}
