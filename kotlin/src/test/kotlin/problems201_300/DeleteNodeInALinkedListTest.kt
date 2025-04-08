package problems201_300

import com.google.common.truth.Truth.assertWithMessage
import concepts.SinglyListNode
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class DeleteNodeInALinkedListTest : SampledTest() {
    @Test
    fun test() =
        DeleteNodeInALinkedList.entries.forEach { solution ->
            getSamples<Array<DeleteNodeInALinkedListSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(
                        SinglyListNode.of(*input.head)!!.also {
                            if (input.node <= -1) {
                                return@also
                            }
                            solution.deleteNode(
                                it.first { n: SinglyListNode -> n.`val` == input.node },
                            )
                        },
                    ).isEqualTo(SinglyListNode.of(*output))
            }
        }
}
