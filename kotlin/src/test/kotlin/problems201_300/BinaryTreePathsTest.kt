package problems201_300

import com.google.common.truth.Truth.assertWithMessage
import concepts.TreeNode
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class BinaryTreePathsTest : SampledTest() {
    @Test
    fun test() =
        BinaryTreePaths.entries.forEach { solution ->
            getSamples<Array<BinaryTreePathsSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.binaryTreePaths(TreeNode.of(*input.root)))
                    .containsExactlyElementsIn(output)
                    .inOrder()
            }
        }
}
