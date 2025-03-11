package problems101_200

import com.google.common.truth.Truth.assertWithMessage
import concepts.SinglyListNode
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import kotlin.test.Test

class ReorderListTest : SampledTest() {
    @Test
    fun test() =
        ReorderList.entries.forEach { solution ->
            getSamples(Array<ReorderListSample>::class.java).forEach { (input, output, message) ->
                val inp = SinglyListNode.of(*input.head)
                solution.reorderList(inp)
                assertWithMessage(message)
                    .that(inp)
                    .isEqualTo(SinglyListNode.of(*output))
            }
        }
}
