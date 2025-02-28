package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import concepts.SinglyListNode
import testing.SampledTest
import kotlin.test.Test

class SwapNodesInPairsTest : SampledTest() {
    @Test
    fun test() {
        for (solution in SwapNodesInPairs.entries) {
            for (sample in getSamples(Array<SwapNodesInPairsSample>::class.java)) {
                assertWithMessage(sample.message)
                    .that(solution.swapPairs(SinglyListNode.of(*sample.input!!.head)))
                    .isEqualTo(SinglyListNode.of(*sample.output!!))
            }
        }
    }
}
