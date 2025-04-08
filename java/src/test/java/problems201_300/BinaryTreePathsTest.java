package problems201_300;

import concepts.TreeNode;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class BinaryTreePathsTest extends SampledTest {
    @Test
    public void test() {
        for (BinaryTreePaths solution : BinaryTreePaths.values()) {
            for (BinaryTreePathsSample sample : getSamples(BinaryTreePathsSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.binaryTreePaths(TreeNode.of(sample.input.root)))
                    .containsExactlyElementsIn(sample.output)
                    .inOrder();
            }
        }
    }
}
