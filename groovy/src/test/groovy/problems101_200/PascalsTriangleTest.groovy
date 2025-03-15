package problems101_200

import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class PascalsTriangleTest extends SampledTest {
    @Test
     void test() {
        PascalsTriangle.values().each { solution ->
            getSamples(PascalsTriangleSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.generate(sample.input.numRows))
                    .containsExactlyElementsIn(
                        sample.output
                            .collect { ints -> ints.toList() }
                            .toList(),
                    ).inOrder()
            }
        }
    }
}
