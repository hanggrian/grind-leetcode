package problems101_200;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class NumberOfIslandsTest extends SampledTest {
    @Test
    public void test() {
        for (NumberOfIslands solution : NumberOfIslands.values()) {
            for (NumberOfIslandsSample sample : getSamples(NumberOfIslandsSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.numIslands(sample.input.grid))
                    .isEqualTo(sample.output);
            }
        }
    }
}
