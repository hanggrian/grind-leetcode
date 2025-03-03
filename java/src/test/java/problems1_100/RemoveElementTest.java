package problems1_100;

import java.util.Arrays;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assertWithMessage;

public class RemoveElementTest extends SampledTest {
    @Test
    public void test() {
        for (RemoveElement solution : RemoveElement.values()) {
            for (RemoveElementSample sample : getSamples(RemoveElementSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.removeElement(
                            sample.input.nums,
                            sample.input.val
                        )
                    ).isEqualTo(sample.output);
                assertThat(
                    Arrays
                        .stream(sample.input.nums)
                        .boxed()
                        .toList()
                        .subList(0, sample.output)
                ).doesNotContain(sample.input.val);
            }
        }
    }
}
