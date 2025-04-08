package problems101_200;

import com.google.common.collect.Iterables;
import concepts.SinglyListNode;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class IntersectionOfTwoLinkedListsTest extends SampledTest {
    @Test
    public void test() {
        for (IntersectionOfTwoLinkedLists solution
            : IntersectionOfTwoLinkedLists.values()) {
            for (IntersectionOfTwoLinkedListsSample sample
                : getSamples(IntersectionOfTwoLinkedListsSample[].class)) {
                SinglyListNode listA = SinglyListNode.of(sample.input.listA);
                SinglyListNode listB = SinglyListNode.of(sample.input.listB);
                if (sample.input.intersectVal < 1) {
                    assertWithMessage(sample.getMessage())
                        .that(solution.getIntersectionNode(listA, listB))
                        .isNull();
                    continue;
                }
                Iterables.get(listA, sample.input.skipA - 1).next =
                    Iterables.get(listB, sample.input.skipB - 1).next;
                assertWithMessage(sample.getMessage())
                    .that(solution.getIntersectionNode(listA, listB))
                    .isNotNull();
            }
        }
    }
}
