package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import concepts.SinglyListNode
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import kotlin.test.Test

class ReverseLinkedList2Test : SampledTest() {
    override fun getSampleFilename(): String = "reverse-linked-list-ii.json"

    @Test
    fun test() =
        ReverseLinkedList2.entries.forEach { solution ->
            getSamples(Array<ReverseLinkedList2Sample>::class.java)
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(
                            solution.reverseBetween(
                                SinglyListNode.of(*input.head),
                                input.left,
                                input.right,
                            ),
                        ).isEqualTo(SinglyListNode.of(*output))
                }
        }
}
