package problems201_300;

import java.util.Arrays;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class MoveZeroesTest extends SampledTest {
    @Test
    public void test() {
        for (MoveZeroes solution : MoveZeroes.values()) {
            for (MoveZeroesSample sample : getSamples(MoveZeroesSample[].class)) {
                int[] nums = sample.input.nums;
                solution.moveZeroes(nums);
                assertWithMessage(sample.getMessage())
                    .that(nums)
                    .asList()
                    .containsExactlyElementsIn(Arrays.stream(sample.output).boxed().toList())
                    .inOrder();
            }
        }
    }
}
