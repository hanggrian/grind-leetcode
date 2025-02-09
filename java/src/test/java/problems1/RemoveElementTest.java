package problems1;

import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assertWithMessage;

public class RemoveElementTest extends SampledTest {
    @Override
    public String getFileName() {
        return "remove_element.json";
    }

    @Test
    public void test() {
        for (RemoveElement solution : RemoveElement.values()) {
            for (TypedSample sample : getSamples(TypedSample[].class)) {
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
                        .collect(Collectors.toList())
                        .subList(0, sample.output)
                ).doesNotContain(sample.input.val);
            }
        }
    }

    public static class TypedSample extends Sample<TypedSample.Input, Integer> {
        public static class Input {
            public int[] nums;
            public int val;
        }
    }
}
