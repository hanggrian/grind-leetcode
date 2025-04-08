package problems101_200;

import concepts.TreeNode;
import java.util.Arrays;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class BinaryTreeRightSideViewTest extends SampledTest {
    @Test
    public void test() {
        for (BinaryTreeRightSideView solution : BinaryTreeRightSideView.values()) {
            for (BinaryTreeRightSideViewSample sample
                : getSamples(BinaryTreeRightSideViewSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.rightSideView(TreeNode.of(sample.input.root)))
                    .containsExactlyElementsIn(Arrays.stream(sample.output).boxed().toList())
                    .inOrder();
            }
        }
    }
}
