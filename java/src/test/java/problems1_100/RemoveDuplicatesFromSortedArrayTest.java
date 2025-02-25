package problems1_100;

import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assertWithMessage;

public class RemoveDuplicatesFromSortedArrayTest extends SampledTest {
    @Test
    public void test() {
        for (RemoveDuplicatesFromSortedArray solution
            : RemoveDuplicatesFromSortedArray.values()) {
            for (TypedSample sample : getSamples(TypedSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.removeDuplicates(sample.input.nums))
                    .isEqualTo(sample.output);
                assertThat(
                    Arrays
                        .stream(sample.input.nums)
                        .boxed()
                        .collect(Collectors.toList())
                        .subList(0, sample.output)
                ).containsNoDuplicates();
            }
        }
    }

    static class TypedSample extends Sample<TypedSample.Input, Integer> {
        static class Input {
            int[] nums;
        }
    }
}
