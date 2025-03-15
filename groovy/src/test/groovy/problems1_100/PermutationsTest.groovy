package problems1_100

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
                        sample
                            .output
                            .collect { ints -> ints.toList() }
                            .toList(),
                    ).inOrder()
            }
        }
    }
}
