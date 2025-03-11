package problems101_200

import com.google.common.truth.Truth.assertWithMessage
import concepts.SinglyListNode
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import kotlin.test.Test

class SortListTest : SampledTest() {
    @Test
    fun test() =
        SortList.entries.forEach { solution ->
            getSamples(Array<SortListSample>::class.java).forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.sortList(SinglyListNode.of(*input.head)))
                    .isEqualTo(SinglyListNode.of(*output))
            }
        }
}
