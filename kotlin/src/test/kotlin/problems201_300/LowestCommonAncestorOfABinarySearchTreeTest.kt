package problems201_300

import com.google.common.truth.Truth.assertWithMessage
import concepts.TreeNode
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class LowestCommonAncestorOfABinarySearchTreeTest : SampledTest() {
    @Test
    fun test() =
        LowestCommonAncestorOfABinarySearchTree.entries.forEach { solution ->
            getSamples<Array<LowestCommonAncestorOfABinarySearchTreeSample>>()
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(
                            solution
                                .lowestCommonAncestor(
                                    TreeNode.of(*input.root),
                                    TreeNode(input.p),
                                    TreeNode(input.q),
                                )!!
                                .`val`,
                        ).isEqualTo(output)
                }
        }
}
