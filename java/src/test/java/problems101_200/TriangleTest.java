package problems101_200;

import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class TriangleTest extends SampledTest {
    @Test
    public void test() {
        for (Triangle solution : Triangle.values()) {
            for (TriangleSample sample : getSamples(TriangleSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.minimumTotal(
                            Arrays
                                .stream(sample.input.triangle)
                                .map(ints ->
                                    Arrays
                                        .stream(ints)
                                        .boxed()
                                        .collect(Collectors.toList())
                                ).collect(Collectors.toList())
                        )
                    ).isEqualTo(sample.output);
            }
        }
    }
}
