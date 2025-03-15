package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class PlusOneTest extends SampledTest {
    @Test
    void test() {
        PlusOne.values().each { solution ->
            getSamples(PlusOneSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.plusOne(sample.input.digits))
                    .asList()
                    .containsExactlyElementsIn(sample.output.toList())
                    .inOrder()
            }
        }
    }
}
