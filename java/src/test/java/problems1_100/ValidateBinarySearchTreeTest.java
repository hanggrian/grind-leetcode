package problems1_100;

import concepts.TreeNode;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class ValidateBinarySearchTreeTest extends SampledTest {
    @Test
    public void test() {
        for (ValidateBinarySearchTree solution : ValidateBinarySearchTree.values()) {
            for (ValidateBinarySearchTreeSample sample
                : getSamples(ValidateBinarySearchTreeSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.isValidBst(TreeNode.of(sample.input.root)))
                    .isEqualTo(sample.output);
            }
        }
    }
}
