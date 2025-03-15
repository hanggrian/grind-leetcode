package problems101_200

import concepts.TreeNode
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class BalancedBinaryTreeTest extends SampledTest {
    @Test
    void test() {
        BalancedBinaryTree.values().each { solution ->
            getSamples(BalancedBinaryTreeSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.isBalanced(TreeNode.of(sample.input.root)))
                    .isEqualTo(sample.output)
            }
        }
    }
}
