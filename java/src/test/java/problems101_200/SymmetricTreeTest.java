package problems101_200;

import concepts.TreeNode;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class SymmetricTreeTest extends SampledTest {
    @Test
    public void test() {
        for (SymmetricTree solution : SymmetricTree.values()) {
            for (SymmetricTreeSample sample : getSamples(SymmetricTreeSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.isSymmetric(TreeNode.of(sample.input.root)))
                    .isEqualTo(sample.output);
            }
        }
    }
}
