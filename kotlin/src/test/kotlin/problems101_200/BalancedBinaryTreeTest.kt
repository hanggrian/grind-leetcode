package problems101_200

import com.google.common.truth.Truth.assertWithMessage
import concepts.TreeNode
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class BalancedBinaryTreeTest : SampledTest() {
    @Test
    fun test() =
        BalancedBinaryTree.entries.forEach { solution ->
            getSamples<Array<BalancedBinaryTreeSample>>()
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(solution.isBalanced(TreeNode.of(*input.root)))
                        .isEqualTo(output)
                }
        }
}
