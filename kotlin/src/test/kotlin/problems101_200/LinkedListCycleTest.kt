package problems101_200

import com.google.common.collect.Iterables
import com.google.common.truth.Truth.assertWithMessage
import concepts.SinglyListNode
import testing.SampledTest
import kotlin.test.Test

class LinkedListCycleTest : SampledTest() {
    @Test
    fun test() {
        for (solution in LinkedListCycle.entries) {
            for (sample in getSamples(Array<LinkedListCycleSample>::class.java)) {
                val input = SinglyListNode.of(*sample.input!!.head)!!
                if (sample.input!!.pos > -1) {
                    Iterables.getLast(input).next = Iterables.get(input, sample.input!!.pos)
                }
                assertWithMessage(sample.message)
                    .that(solution.hasCycle(input))
                    .isEqualTo(sample.output)
            }
        }
    }
}
