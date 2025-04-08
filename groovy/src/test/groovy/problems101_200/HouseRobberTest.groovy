package problems101_200

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class HouseRobberTest extends SampledTest {
    @Test
    void test() {
        HouseRobber.values().each { solution ->
            getSamples(HouseRobberSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.rob(sample.input.nums))
                    .isEqualTo(sample.output)
            }
        }
    }
}
