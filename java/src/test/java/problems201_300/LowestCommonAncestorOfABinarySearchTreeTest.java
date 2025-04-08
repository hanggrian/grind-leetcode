package problems201_300;

import concepts.TreeNode;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class LowestCommonAncestorOfABinarySearchTreeTest extends SampledTest {
    @Test
    public void test() {
        for (LowestCommonAncestorOfABinarySearchTree solution
            : LowestCommonAncestorOfABinarySearchTree.values()) {
            for (LowestCommonAncestorOfABinarySearchTreeSample sample
                : getSamples(LowestCommonAncestorOfABinarySearchTreeSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(
                        solution
                            .lowestCommonAncestor(
                                TreeNode.of(sample.input.root),
                                new TreeNode(sample.input.p),
                                new TreeNode(sample.input.q)
                            ).val
                    ).isEqualTo(sample.output);
            }
        }
    }
}
