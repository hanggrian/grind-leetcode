package problems1_100;

import java.util.Arrays;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class SortColorsTest extends SampledTest {
    @Test
    public void test() {
        for (SortColors solution : SortColors.values()) {
            for (SortColorsSample sample : getSamples(SortColorsSample[].class)) {
                int[] nums = sample.input.nums;
                solution.sortColors(nums);
                assertWithMessage(sample.getMessage())
                    .that(nums)
                    .asList()
                    .containsExactlyElementsIn(
                        Arrays
                            .stream(sample.output)
                            .boxed()
                            .toList()
                    );
            }
        }
    }
}
