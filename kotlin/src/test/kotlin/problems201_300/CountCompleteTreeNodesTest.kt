package problems201_300

import com.google.common.truth.Truth.assertWithMessage
import concepts.TreeNode
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class CountCompleteTreeNodesTest : SampledTest() {
    @Test
    fun test() =
        CountCompleteTreeNodes.entries.forEach { solution ->
            getSamples<Array<CountCompleteTreeNodesSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.countNodes(TreeNode.of(*input.root)))
                    .isEqualTo(output)
            }
        }
}
