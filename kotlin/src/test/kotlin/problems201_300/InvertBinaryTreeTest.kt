package problems201_300

import com.google.common.truth.Truth.assertWithMessage
import concepts.TreeNode
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class InvertBinaryTreeTest : SampledTest() {
    @Test
    fun test() =
        InvertBinaryTree.entries.forEach { solution ->
            getSamples<Array<InvertBinaryTreeSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.invertTree(TreeNode.of(*input.root)))
                    .isEqualTo(TreeNode.of(*output))
            }
        }
}
