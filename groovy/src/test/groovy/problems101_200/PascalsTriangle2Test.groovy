package problems101_200

import java.util.stream.Collectors
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class PascalsTriangle2Test extends SampledTest {
    @Test
    void test() {
        PascalsTriangle2.values().each { solution ->
            getSamples(PascalsTriangle2Sample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.getRow(sample.input.rowIndex))
                    .containsExactlyElementsIn(
                        Arrays
                            .stream(sample.output)
                            .boxed()
                            .collect(Collectors.toList()),
                    )
            }
        }
    }

    @Override
    protected String getSampleFilename() {
        return 'pascals-triangle-ii.json'
    }
}
