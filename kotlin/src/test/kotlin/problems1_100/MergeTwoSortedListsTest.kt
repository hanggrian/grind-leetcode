package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import concepts.SinglyListNode
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import kotlin.test.Test

class MergeTwoSortedListsTest : SampledTest() {
    @Test
    fun test() =
        MergeTwoSortedLists.entries.forEach { solution ->
            getSamples(Array<MergeTwoSortedListsSample>::class.java)
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(
                            solution.mergeTwoLists(
                                SinglyListNode.of(*input.list1),
                                SinglyListNode.of(*input.list2),
                            ),
                        ).isEqualTo(SinglyListNode.of(*output))
                }
        }
}
