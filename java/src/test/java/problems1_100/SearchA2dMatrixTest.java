package problems1_100;

import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class SearchA2dMatrixTest extends SampledTest {
    @Override
    protected String getSampleFilename() {
        return "search-a-2d-matrix.json";
    }

    @Test
    public void test() {
        for (SearchA2dMatrix solution : SearchA2dMatrix.values()) {
            for (SearchA2dMatrixSample sample : getSamples(SearchA2dMatrixSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.searchMatrix(sample.input.matrix, sample.input.target))
                    .isEqualTo(sample.output);
            }
        }
    }
}
