package problems101_200

import concepts.TreeNode
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class BinaryTreeZigzagLevelOrderTraversalTest extends SampledTest {
    @Test
    void test() {
        BinaryTreeZigzagLevelOrderTraversal.values().each { solution ->
            getSamples(BinaryTreeZigzagLevelOrderTraversalSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.zigzagLevelOrder(TreeNode.of(sample.input.root)))
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
