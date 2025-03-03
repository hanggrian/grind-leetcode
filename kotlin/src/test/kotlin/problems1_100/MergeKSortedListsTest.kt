package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import concepts.SinglyListNode
import sample.SampledTest
import kotlin.test.Test

class MergeKSortedListsTest : SampledTest() {
    @Test
    fun test() {
        for (solution in MergeKSortedLists.entries) {
            for (sample in getSamples(Array<MergeKSortedListsSample>::class.java)) {
                assertWithMessage(sample.message)
                    .that(
                        solution.mergeKLists(
                            sample.input!!
                                .lists
                                .map { SinglyListNode.of(*it) }
                                .toTypedArray<SinglyListNode?>(),
                        ),
                    ).isEqualTo(SinglyListNode.of(*sample.output!!))
            }
        }
    }
}
