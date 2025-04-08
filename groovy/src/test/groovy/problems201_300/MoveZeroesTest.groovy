package problems201_300

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class MoveZeroesTest extends SampledTest {
    @Test
    void test() {
        MoveZeroes.values().each { solution ->
            getSamples(MoveZeroesSample[].class).each { sample ->
                var nums = sample.input.nums
                solution.moveZeroes(nums)
                assertWithMessage(sample.getMessage())
                    .that(nums)
                    .asList()
                    .containsExactlyElementsIn(Arrays.stream(sample.output).boxed().toList())
                    .inOrder()
            }
        }
    }
}
