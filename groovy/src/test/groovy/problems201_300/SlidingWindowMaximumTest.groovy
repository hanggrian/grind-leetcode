package problems201_300

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class SlidingWindowMaximumTest extends SampledTest {
    @Test
    void test() {
        SlidingWindowMaximum.values().each { solution ->
            getSamples(SlidingWindowMaximumSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.maxSlidingWindow(sample.input.nums, sample.input.k))
                    .asList()
                    .containsExactlyElementsIn(Arrays.stream(sample.output).boxed().toList())
            }
        }
    }
}
