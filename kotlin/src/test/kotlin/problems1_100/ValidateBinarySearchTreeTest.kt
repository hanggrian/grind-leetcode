package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import concepts.TreeNode
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class ValidateBinarySearchTreeTest : SampledTest() {
    @Test
    fun test() =
        ValidateBinarySearchTree.entries.forEach { solution ->
            getSamples<Array<ValidateBinarySearchTreeSample>>()
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(solution.isValidBst(TreeNode.of(*input.root)))
                        .isEqualTo(output)
                }
        }
}
