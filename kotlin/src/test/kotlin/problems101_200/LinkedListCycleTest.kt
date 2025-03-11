package problems101_200

import com.google.common.collect.Iterables
import com.google.common.truth.Truth.assertWithMessage
import concepts.SinglyListNode
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import kotlin.test.Test

class LinkedListCycleTest : SampledTest() {
    @Test
    fun test() =
        LinkedListCycle.entries.forEach { solution ->
            getSamples(Array<LinkedListCycleSample>::class.java)
                .forEach { (input, output, message) ->
                    val inp = SinglyListNode.of(*input!!.head)!!
                    if (input.pos > -1) {
                        Iterables.getLast(inp).next = Iterables.get(inp, input.pos)
                    }
                    assertWithMessage(message)
                        .that(solution.hasCycle(inp))
                        .isEqualTo(output)
                }
        }
}
