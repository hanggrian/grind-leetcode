package problems101_200

import concepts.TreeNode
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class SymmetricTreeTest extends SampledTest {
    @Test
    void test() {
        SymmetricTree.values().each { solution ->
            getSamples(SymmetricTreeSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.isSymmetric(TreeNode.of(sample.input.root)))
                    .isEqualTo(sample.output)
            }
        }
    }
}
