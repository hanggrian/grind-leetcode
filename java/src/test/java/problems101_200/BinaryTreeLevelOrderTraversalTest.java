package problems101_200;

import concepts.TreeNode;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class BinaryTreeLevelOrderTraversalTest extends SampledTest {
    @Test
    public void test() {
        for (BinaryTreeLevelOrderTraversal solution : BinaryTreeLevelOrderTraversal.values()) {
            for (BinaryTreeLevelOrderTraversalSample sample
                : getSamples(BinaryTreeLevelOrderTraversalSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.levelOrder(TreeNode.of(sample.input.root)))
                    .isEqualTo(
                        Arrays
                            .stream(sample.output)
                            .map(ints ->
                                Arrays
                                    .stream(ints)
                                    .boxed()
                                    .collect(Collectors.toList())
                            ).collect(Collectors.toList())
                    );
            }
        }
    }
}
