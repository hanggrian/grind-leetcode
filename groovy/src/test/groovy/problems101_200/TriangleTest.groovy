package problems101_200

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
                            sample.input.triangle
                                .collect { ints -> ints.toList() }
                                .toList(),
                        ),
                    ).isEqualTo(sample.output)
            }
        }
    }
}
