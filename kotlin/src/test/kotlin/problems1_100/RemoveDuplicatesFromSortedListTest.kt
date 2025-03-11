package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import concepts.SinglyListNode
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import kotlin.test.Test

class RemoveDuplicatesFromSortedListTest : SampledTest() {
    @Test
    fun test() =
        RemoveDuplicatesFromSortedList.entries.forEach { solution ->
            getSamples(Array<RemoveDuplicatesFromSortedListSample>::class.java)
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(solution.deleteDuplicates(SinglyListNode.of(*input.head)))
                        .isEqualTo(SinglyListNode.of(*output))
                }
        }
}
