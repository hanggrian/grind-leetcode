package problems101_200

import com.google.common.truth.Truth.assertWithMessage
import concepts.SinglyListNode
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class ReorderListTest : SampledTest() {
    @Test
    fun test() =
        ReorderList.entries.forEach { solution ->
            getSamples<Array<ReorderListSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(SinglyListNode.of(*input.head).also { solution.reorderList(it) })
                    .isEqualTo(SinglyListNode.of(*output))
            }
        }
}
