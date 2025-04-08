package problems301_400

import com.google.common.truth.Truth.assertWithMessage
import concepts.SinglyListNode
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class OddEvenLinkedListTest : SampledTest() {
    @Test
    fun test() =
        OddEvenLinkedList.entries.forEach { solution ->
            getSamples<Array<OddEvenLinkedListSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.oddEvenList(SinglyListNode.of(*input.head)))
                    .isEqualTo(SinglyListNode.of(*output))
            }
        }
}
