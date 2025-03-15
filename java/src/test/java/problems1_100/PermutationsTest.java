package problems1_100;

import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class PermutationsTest extends SampledTest {
    @Test
    public void test() {
        for (Permutations solution : Permutations.values()) {
            for (PermutationsSample sample : getSamples(PermutationsSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.permute(sample.input.nums))
                    .containsExactlyElementsIn(
                        Arrays
                            .stream(sample.output)
                            .map(ints ->
                                Arrays
                                    .stream(ints)
                                    .boxed()
                                    .collect(Collectors.toList())
                            ).collect(Collectors.toList())
                    ).inOrder();
            }
        }
    }
}
