package problems101_200

import java.util.stream.Collectors
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class TriangleTest extends SampledTest {
    @Test
    void test() {
        Triangle.values().each { solution ->
            getSamples(TriangleSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.minimumTotal(
                            Arrays
                                .stream(sample.input.triangle)
                                .map(ints ->
                                    Arrays
                                        .stream(ints)
                                        .boxed()
                                        .collect(Collectors.toList()),
                                ).collect(Collectors.toList()),
                        )
                    ).isEqualTo(sample.output)
            }
        }
    }
}
