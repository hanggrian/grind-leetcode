package problems401_500

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class IslandPerimeterTest extends SampledTest {
    @Test
    void test() {
        IslandPerimeter.values().each { solution ->
            getSamples(IslandPerimeterSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.islandPerimeter(sample.input.grid))
                    .isEqualTo(sample.output)
            }
        }
    }
}
