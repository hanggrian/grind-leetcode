package problems101_200

import concepts.TreeNode
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class BinaryTreeLevelOrderTraversalTest extends SampledTest {
    @Test
    void test() {
        BinaryTreeLevelOrderTraversal.values().each { solution ->
            getSamples(BinaryTreeLevelOrderTraversalSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.levelOrder(TreeNode.of(sample.input.root)))
                    .isEqualTo(
                        sample
                            .output
                            .collect { ints -> ints.toList() }
                            .toList(),
                    )
            }
        }
    }
}
