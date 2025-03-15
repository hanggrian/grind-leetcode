package problems101_200

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class PascalsTriangle2Test extends SampledTest {
    @Override
    protected String getSampleFilename() {
        return 'pascals-triangle-ii.json'
    }

    @Test
    void test() {
        PascalsTriangle2.values().each { solution ->
            getSamples(PascalsTriangle2Sample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.getRow(sample.input.rowIndex))
                    .containsExactlyElementsIn(sample.output.toList())
                    .inOrder()
            }
        }
    }
}
