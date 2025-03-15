package problems201_300

import concepts.TreeNode
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class InvertBinaryTreeTest extends SampledTest {
    @Test
    void test() {
        InvertBinaryTree.values().each { solution ->
            getSamples(InvertBinaryTreeSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.invertTree(TreeNode.of(sample.input.root)))
                    .isEqualTo(TreeNode.of(sample.output))
            }
        }
    }
}
