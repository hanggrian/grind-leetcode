package problems101_200;

import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class PascalsTriangle2Test extends SampledTest {
    @Override
    protected String getSampleFilename() {
        return "pascals-triangle-ii.json";
    }

    @Test
    public void test() {
        for (PascalsTriangle2 solution : PascalsTriangle2.values()) {
            for (PascalsTriangle2Sample sample : getSamples(PascalsTriangle2Sample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.getRow(sample.input.rowIndex))
                    .containsExactlyElementsIn(
                        Arrays
                            .stream(sample.output)
                            .boxed()
                            .collect(Collectors.toList())
                    ).inOrder();
            }
        }
    }
}
