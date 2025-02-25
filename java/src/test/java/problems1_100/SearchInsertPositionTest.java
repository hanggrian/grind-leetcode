package problems1_100;

import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class SearchInsertPositionTest extends SampledTest {
    @Test
    public void test() {
        for (SearchInsertPosition solution : SearchInsertPosition.values()) {
            for (TypedSample sample : getSamples(TypedSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.searchInsert(
                            sample.input.nums,
                            sample.input.target
                        )
                    ).isEqualTo(sample.output);
            }
        }
    }

    static class TypedSample extends Sample<TypedSample.Input, Integer> {
        static class Input {
            int[] nums;
            int target;
        }
    }
}
