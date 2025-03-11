package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import concepts.SinglyListNode
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import kotlin.test.Test

class RemoveDuplicatesFromSortedList2Test : SampledTest() {
    override fun getSampleFilename(): String = "remove-duplicates-from-sorted-list-ii.json"

    @Test
    fun test() =
        RemoveDuplicatesFromSortedList2.entries.forEach { solution ->
            getSamples(Array<RemoveDuplicatesFromSortedList2Sample>::class.java)
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(solution.deleteDuplicates(SinglyListNode.of(*input.head)))
                        .isEqualTo(SinglyListNode.of(*output))
                }
        }
}
