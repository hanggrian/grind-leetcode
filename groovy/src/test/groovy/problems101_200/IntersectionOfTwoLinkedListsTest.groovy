package problems101_200

import com.google.common.collect.Iterables
import concepts.SinglyListNode
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class IntersectionOfTwoLinkedListsTest extends SampledTest {
    @Test
    void test() {
        IntersectionOfTwoLinkedLists.values().each { solution ->
            getSamples(IntersectionOfTwoLinkedListsSample[].class).each { sample ->
                var listA = SinglyListNode.of(sample.input.listA)
                var listB = SinglyListNode.of(sample.input.listB)
                if (sample.input.intersectVal < 1) {
                    assertWithMessage(sample.getMessage())
                        .that(solution.getIntersectionNode(listA, listB))
                        .isNull()
                    return
                }
                Iterables.get(listA, sample.input.skipA - 1).next =
                    Iterables.get(listB, sample.input.skipB - 1).next
                assertWithMessage(sample.getMessage())
                    .that(solution.getIntersectionNode(listA, listB))
                    .isNotNull()
            }
        }
    }
}
