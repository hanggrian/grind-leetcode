package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import concepts.TreeNode
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class SameTreeTest : SampledTest() {
    @Test
    fun test() =
        SameTree.entries.forEach { solution ->
            getSamples<Array<SameTreeSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(
                        solution.isSameTree(
                            TreeNode.of(*input.p),
                            TreeNode.of(*input.q),
                        ),
                    ).isEqualTo(output)
            }
        }
}
