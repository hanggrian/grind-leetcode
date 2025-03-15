package problems201_300;

import concepts.TreeNode;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class InvertBinaryTreeTest extends SampledTest {
    @Test
    public void test() {
        for (InvertBinaryTree solution : InvertBinaryTree.values()) {
            for (InvertBinaryTreeSample sample : getSamples(InvertBinaryTreeSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.invertTree(TreeNode.of(sample.input.root)))
                    .isEqualTo(TreeNode.of(sample.output));
            }
        }
    }
}
