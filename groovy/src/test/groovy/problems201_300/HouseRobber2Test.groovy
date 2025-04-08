package problems201_300

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class HouseRobber2Test extends SampledTest {
    @Override
    protected String getSampleFilename() {
        return "house-robber-ii.json"
    }

    @Test
    void test() {
        HouseRobber2.values().each { solution ->
            getSamples(HouseRobber2Sample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.rob(sample.input.nums))
                    .isEqualTo(sample.output)
            }
        }
    }
}
