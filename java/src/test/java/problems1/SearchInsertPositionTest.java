package problems1;

import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class SearchInsertPositionTest extends SampledTest {
    @Override
    public String getFileName() {
        return "search_insert_position.json";
    }

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

    public static class TypedSample extends Sample<TypedSample.Input, Integer> {
        public static class Input {
            public int[] nums;
            public int target;
        }
    }
}
