package problems101_200;

import concepts.TreeNode;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class ConstructBinaryTreeFromPreorderAndInorderTraversalTest extends SampledTest {
    @Test
    public void test() {
        for (ConstructBinaryTreeFromPreorderAndInorderTraversal solution
            : ConstructBinaryTreeFromPreorderAndInorderTraversal.values()) {
            for (ConstructBinaryTreeFromPreorderAndInorderTraversalSample sample
                : getSamples(ConstructBinaryTreeFromPreorderAndInorderTraversalSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.buildTree(sample.input.preorder, sample.input.inorder))
                    .isEqualTo(TreeNode.of(sample.output));
            }
        }
    }
}
