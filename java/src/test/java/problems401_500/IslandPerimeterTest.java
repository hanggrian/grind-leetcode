package problems401_500;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class IslandPerimeterTest extends SampledTest {
    @Test
    public void test() {
        for (IslandPerimeter solution : IslandPerimeter.values()) {
            for (IslandPerimeterSample sample : getSamples(IslandPerimeterSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.islandPerimeter(sample.input.grid))
                    .isEqualTo(sample.output);
            }
        }
    }
}
