package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import concepts.SinglyListNode
import sample.SampledTest
import kotlin.test.Test

class RemoveNthNodeFromEndOfListTest : SampledTest() {
    @Test
    fun test() {
        for (solution in RemoveNthNodeFromEndOfList.entries) {
            for (sample in getSamples(Array<RemoveNthNodeFromEndOfListSample>::class.java)) {
                assertWithMessage(sample.message)
                    .that(
                        solution.removeNthFromEnd(
                            SinglyListNode.of(*sample.input!!.head),
                            sample.input!!.n,
                        ),
                    ).isEqualTo(SinglyListNode.of(*sample.output!!))
            }
        }
    }
}
