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
                val inp = SinglyListNode.of(*input.head)!!
                var out: SinglyListNode? = null
                if (input.pos > -1) {
                    out = Iterables.get(inp, input.pos)
                    Iterables.getLast(inp).next = out
                }
                assertWithMessage(message)
                    .that(solution.detectCycle(inp))
                    .isEqualTo(out)
            }
        }
}
