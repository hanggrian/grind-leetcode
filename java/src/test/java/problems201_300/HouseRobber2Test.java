package problems201_300;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class HouseRobber2Test extends SampledTest {
    @Override
    protected String getSampleFilename() {
        return "house-robber-ii.json";
    }

    @Test
    public void test() {
        for (HouseRobber2 solution : HouseRobber2.values()) {
            for (HouseRobber2Sample sample : getSamples(HouseRobber2Sample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.rob(sample.input.nums))
                    .isEqualTo(sample.output);
            }
        }
    }
}
