package problems101_200;

import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class PascalsTriangleTest extends SampledTest {
    @Test
    public void test() {
        for (PascalsTriangle solution : PascalsTriangle.values()) {
            for (PascalsTriangleSample sample : getSamples(PascalsTriangleSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.generate(sample.input.numRows))
                    .containsExactlyElementsIn(
                        Arrays
                            .stream(sample.output)
                            .map(ints ->
                                Arrays
                                    .stream(ints)
                                    .boxed()
                                    .collect(Collectors.toList())
                            ).collect(Collectors.toList())
                    );
            }
        }
    }
}
