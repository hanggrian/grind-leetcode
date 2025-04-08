package problems201_300;

import concepts.TreeNode;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class CountCompleteTreeNodesTest extends SampledTest {
    @Test
    public void test() {
        for (CountCompleteTreeNodes solution : CountCompleteTreeNodes.values()) {
            for (CountCompleteTreeNodesSample sample
                : getSamples(CountCompleteTreeNodesSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.countNodes(TreeNode.of(sample.input.root)))
                    .isEqualTo(sample.output);
            }
        }
    }
}
