package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import concepts.SinglyListNode
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import kotlin.test.Test

class MergeKSortedListsTest : SampledTest() {
    @Test
    fun test() =
        MergeKSortedLists.entries.forEach { solution ->
            getSamples(Array<MergeKSortedListsSample>::class.java)
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(
                            solution.mergeKLists(
                                input.lists
                                    .map { SinglyListNode.of(*it) }
                                    .toTypedArray<SinglyListNode?>(),
                            ),
                        ).isEqualTo(SinglyListNode.of(*output))
                }
        }
}
