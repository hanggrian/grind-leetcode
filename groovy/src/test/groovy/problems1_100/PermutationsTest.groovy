package problems1_100

import java.util.stream.Collectors
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class PermutationsTest extends SampledTest {
    @Test
    void test() {
        Permutations.values().each { solution ->
            getSamples(PermutationsSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.permute(sample.input.nums))
                    .containsExactlyElementsIn(
                        Arrays
                            .stream(sample.output)
                            .map(ints ->
                                Arrays
                                    .stream(ints)
                                    .boxed()
                                    .collect(Collectors.toList()),
                            ).collect(Collectors.toList()),
                    )
            }
        }
    }
}
