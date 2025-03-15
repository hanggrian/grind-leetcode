package problems1_100

import concepts.TreeNode
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class SameTreeTest extends SampledTest {
    @Test
    void test() {
        SameTree.values().each { solution ->
            getSamples(SameTreeSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.isSameTree(
                            TreeNode.of(sample.input.p),
                            TreeNode.of(sample.input.q),
                        ),
                    ).isEqualTo(sample.output)
            }
        }
    }
}
