package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import concepts.SinglyListNode
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import kotlin.test.Test

class SwapNodesInPairsTest : SampledTest() {
    @Test
    fun test() =
        SwapNodesInPairs.entries.forEach { solution ->
            getSamples(Array<SwapNodesInPairsSample>::class.java)
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(solution.swapPairs(SinglyListNode.of(*input.head)))
                        .isEqualTo(SinglyListNode.of(*output))
                }
        }
}
