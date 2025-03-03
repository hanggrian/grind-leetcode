package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class SearchInsertPositionTest extends SampledTest {
    @Test
    void test() {
        for (SearchInsertPosition solution : SearchInsertPosition.values()) {
            for (SearchInsertPositionSample sample : getSamples(SearchInsertPositionSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.searchInsert(
                            sample.input.nums,
                            sample.input.target,
                        ),
                    ).isEqualTo(sample.output)
            }
        }
    }
}
