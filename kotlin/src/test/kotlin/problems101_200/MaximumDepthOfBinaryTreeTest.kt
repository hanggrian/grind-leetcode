package problems101_200

import com.google.common.truth.Truth.assertWithMessage
import concepts.TreeNode
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class MaximumDepthOfBinaryTreeTest : SampledTest() {
    @Test
    fun test() =
        MaximumDepthOfBinaryTree.values().forEach { solution ->
            getSamples<Array<MaximumDepthOfBinaryTreeSample>>()
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(solution.maxDepth(TreeNode.of(*input.root)))
                        .isEqualTo(output)
                }
        }
}
