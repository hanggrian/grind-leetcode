package problems201_300

import concepts.TreeNode
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class LowestCommonAncestorOfABinarySearchTreeTest extends SampledTest {
    @Test
    void test() {
        LowestCommonAncestorOfABinarySearchTree.values().each { solution ->
            getSamples(LowestCommonAncestorOfABinarySearchTreeSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.
                            lowestCommonAncestor(
                                TreeNode.of(sample.input.root),
                                new TreeNode(sample.input.p),
                                new TreeNode(sample.input.q),
                            ).val,
                    ).isEqualTo(sample.output)
            }
        }
    }
}
