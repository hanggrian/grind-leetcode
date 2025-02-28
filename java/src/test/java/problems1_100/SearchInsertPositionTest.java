package problems1_100;

import org.junit.Test;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class SearchInsertPositionTest extends SampledTest {
    @Test
    public void test() {
        for (SearchInsertPosition solution : SearchInsertPosition.values()) {
            for (SearchInsertPositionSample sample
                : getSamples(SearchInsertPositionSample[].class)) {
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
}
