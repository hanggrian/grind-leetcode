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

class LinkedListCycleTest : SampledTest() {
    @Test
    fun test() =
        LinkedListCycle.entries.forEach { solution ->
            getSamples<Array<LinkedListCycleSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(
                        solution.hasCycle(
                            SinglyListNode.of(*input!!.head)!!.also {
                                if (input.pos > -1) {
                                    Iterables.getLast(it).next = Iterables.get(it, input.pos)
                                }
                            },
                        ),
                    ).isEqualTo(output)
            }
        }
}
