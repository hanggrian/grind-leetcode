package problems101_200

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class NumberOfIslandsTest extends SampledTest {
    @Test
    void test() {
        NumberOfIslands.values().each { solution ->
            getSamples(NumberOfIslandsSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.numIslands(sample.input.grid))
                    .isEqualTo(sample.output)
            }
        }
    }
}
