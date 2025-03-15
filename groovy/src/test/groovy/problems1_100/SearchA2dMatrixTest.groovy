package problems1_100

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class SearchA2dMatrixTest extends SampledTest {
    @Override
    protected String getSampleFilename() {
        return 'search-a-2d-matrix.json'
    }

    @Test
    void test() {
        SearchA2dMatrix.values().each { solution ->
            getSamples(SearchA2dMatrixSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.searchMatrix(sample.input.matrix, sample.input.target))
                    .isEqualTo(sample.output)
            }
        }
    }
}
