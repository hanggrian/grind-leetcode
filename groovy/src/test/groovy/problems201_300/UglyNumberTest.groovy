package problems201_300

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class UglyNumberTest extends SampledTest {
    @Test
    void test() {
        UglyNumber.values().each { solution ->
            getSamples(UglyNumberSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.isUgly(sample.input.n))
                    .isEqualTo(sample.output)
            }
        }
    }
}
