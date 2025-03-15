package problems101_200

import concepts.TreeNode
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class ConstructBinaryTreeFromPreorderAndInorderTraversalTest extends SampledTest {
    @Test
    void test() {
        ConstructBinaryTreeFromPreorderAndInorderTraversal.values().each { solution ->
            getSamples(ConstructBinaryTreeFromPreorderAndInorderTraversalSample[].class)
                .each { sample ->
                    assertWithMessage(sample.getMessage())
                        .that(solution.buildTree(sample.input.preorder, sample.input.inorder))
                        .isEqualTo(TreeNode.of(sample.output))
                }
        }
    }
}
