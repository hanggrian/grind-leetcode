package problems101_200

import com.google.common.collect.Iterables
import com.google.common.truth.Truth.assertWithMessage
import concepts.SinglyListNode
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class LinkedListCycle2Test : SampledTest() {
    override fun getSampleFilename(): String = "linked-list-cycle-ii.json"

    @Test
    fun test() =
        LinkedListCycle2.entries.forEach { solution ->
            getSamples<Array<LinkedListCycle2Sample>>().forEach { (input, _, message) ->
                var result: SinglyListNode? = null
                assertWithMessage(message)
                    .that(
                        solution.detectCycle(
                            SinglyListNode.of(*input.head)!!.also {
                                if (input.pos <= -1) {
                                    return@also
                                }
                                result = Iterables.get(it, input.pos)
                                Iterables.getLast(it).next = result
                            },
                        ),
                    ).isEqualTo(result)
            }
        }
}
