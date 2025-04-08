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

class IntersectionOfTwoLinkedListsTest : SampledTest() {
    @Test
    fun test() =
        IntersectionOfTwoLinkedLists.entries.forEach { solution ->
            getSamples<Array<IntersectionOfTwoLinkedListsSample>>()
                .forEach { (input, _, message) ->
                    val listA = SinglyListNode.of(*input.listA)!!
                    val listB = SinglyListNode.of(*input.listB)!!
                    if (input.intersectVal < 1) {
                        assertWithMessage(message)
                            .that(solution.getIntersectionNode(listA, listB))
                            .isNull()
                        return@forEach
                    }
                    Iterables.get(listA, input.skipA - 1).next =
                        Iterables.get(listB, input.skipB - 1).next
                    assertWithMessage(message)
                        .that(solution.getIntersectionNode(listA, listB))
                        .isNotNull()
                }
        }
}
