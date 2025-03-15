package problems1_100;

import concepts.TreeNode;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class SameTreeTest extends SampledTest {
    @Test
    public void test() {
        for (SameTree solution : SameTree.values()) {
            for (SameTreeSample sample : getSamples(SameTreeSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.isSameTree(
                            TreeNode.of(sample.input.p),
                            TreeNode.of(sample.input.q)
                        )
                    ).isEqualTo(sample.output);
            }
        }
    }
}
