package problems101_200

import com.google.common.truth.Truth.assertWithMessage
import concepts.TreeNode
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class BinaryTreeZigzagLevelOrderTraversalTest : SampledTest() {
    @Test
    fun test() =
        BinaryTreeZigzagLevelOrderTraversal.entries.forEach { solution ->
            getSamples<Array<BinaryTreeLevelOrderTraversalSample>>()
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(solution.zigzagLevelOrder(TreeNode.of(*input.root)))
                        .isEqualTo(output.map { it.toList() })
                }
        }
}
