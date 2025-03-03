package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import concepts.SinglyListNode
import sample.SampledTest
import kotlin.test.Test

class MergeTwoSortedListsTest : SampledTest() {
    @Test
    fun test() {
        for (solution in MergeTwoSortedLists.entries) {
            for (sample in getSamples(Array<MergeTwoSortedListsSample>::class.java)) {
                assertWithMessage(sample.message)
                    .that(
                        solution.mergeTwoLists(
                            SinglyListNode.of(*sample.input!!.list1),
                            SinglyListNode.of(*sample.input!!.list2),
                        ),
                    ).isEqualTo(SinglyListNode.of(*sample.output!!))
            }
        }
    }
}
