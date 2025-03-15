package problems101_200

import com.google.common.truth.Truth.assertWithMessage
import concepts.TreeNode
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class ConstructBinaryTreeFromPreorderAndInorderTraversalTest : SampledTest() {
    @Test
    fun test() =
        ConstructBinaryTreeFromPreorderAndInorderTraversal.entries.forEach { solution ->
            getSamples<Array<ConstructBinaryTreeFromPreorderAndInorderTraversalSample>>()
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(solution.buildTree(input.preorder, input.inorder))
                        .isEqualTo(TreeNode.of(*output))
                }
        }
}
