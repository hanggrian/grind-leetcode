package problems101_200;

import concepts.TreeNode;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class MaximumDepthOfBinaryTreeTest extends SampledTest {
    @Test
    public void test() {
        for (MaximumDepthOfBinaryTree solution : MaximumDepthOfBinaryTree.values()) {
            for (MaximumDepthOfBinaryTreeSample sample
                    : getSamples(MaximumDepthOfBinaryTreeSample[].class)) {
                assertWithMessage(sample.getMessage())
                        .that(solution.maxDepth(TreeNode.of(sample.input.root)))
                        .isEqualTo(sample.output);
            }
        }
    }
}
