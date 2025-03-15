package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import concepts.SinglyListNode
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class RemoveNthNodeFromEndOfListTest : SampledTest() {
    @Test
    fun test() =
        RemoveNthNodeFromEndOfList.entries.forEach { solution ->
            getSamples<Array<RemoveNthNodeFromEndOfListSample>>()
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(solution.removeNthFromEnd(SinglyListNode.of(*input.head), input.n))
                        .isEqualTo(SinglyListNode.of(*output))
                }
        }
}
