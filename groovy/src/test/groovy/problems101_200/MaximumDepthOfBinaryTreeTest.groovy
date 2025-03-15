package problems101_200

import concepts.TreeNode
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class MaximumDepthOfBinaryTreeTest extends SampledTest {
    @Test
    void test() {
        MaximumDepthOfBinaryTree.values().each { solution ->
            getSamples(MaximumDepthOfBinaryTreeSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.maxDepth(TreeNode.of(sample.input.root)))
                    .isEqualTo(sample.output)
            }
        }
    }
}
