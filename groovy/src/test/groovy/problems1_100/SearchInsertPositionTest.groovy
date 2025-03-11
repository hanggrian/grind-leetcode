package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class SearchInsertPositionTest extends SampledTest {
    @Test
    void test() {
        SearchInsertPosition.values().each { solution ->
            getSamples(SearchInsertPositionSample[].class).each { sample ->
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
