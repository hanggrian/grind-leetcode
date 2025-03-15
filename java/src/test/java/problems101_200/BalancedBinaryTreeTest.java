package problems101_200;

import concepts.TreeNode;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class BalancedBinaryTreeTest extends SampledTest {
    @Test
    public void test() {
        for (BalancedBinaryTree solution : BalancedBinaryTree.values()) {
            for (BalancedBinaryTreeSample sample : getSamples(BalancedBinaryTreeSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.isBalanced(TreeNode.of(sample.input.root)))
                    .isEqualTo(sample.output);
            }
        }
    }
}
