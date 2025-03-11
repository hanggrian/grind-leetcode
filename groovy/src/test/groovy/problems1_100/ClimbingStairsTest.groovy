package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class ClimbingStairsTest extends SampledTest {
    @Test
    void test() {
        ClimbingStairs.values().each { solution ->
            getSamples(ClimbingStairsSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.climbStairs(sample.input.n))
                    .isEqualTo(sample.output)
            }
        }
    }
}
