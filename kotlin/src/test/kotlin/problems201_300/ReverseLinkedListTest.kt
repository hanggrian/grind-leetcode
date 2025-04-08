package problems201_300

import com.google.common.truth.Truth.assertWithMessage
import concepts.SinglyListNode
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class ReverseLinkedListTest : SampledTest() {
    @Test
    fun test() =
        ReverseLinkedList.entries.forEach { solution ->
            getSamples<Array<ReverseLinkedListSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.reverseList(SinglyListNode.of(*input.head)))
                    .isEqualTo(SinglyListNode.of(*output))
            }
        }
}
