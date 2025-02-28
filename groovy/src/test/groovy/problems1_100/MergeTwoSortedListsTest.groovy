package problems1_100

import concepts.SinglyListNode
import org.junit.Test
import testing.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class MergeTwoSortedListsTest extends SampledTest {
    @Test
    void test() {
        for (MergeTwoSortedLists solution : MergeTwoSortedLists.values()) {
            for (MergeTwoSortedListsSample sample : getSamples(MergeTwoSortedListsSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.mergeTwoLists(
                            SinglyListNode.of(sample.input.list1),
                            SinglyListNode.of(sample.input.list2),
                        ),
                    ).isEqualTo(SinglyListNode.of(sample.output))
            }
        }
    }
}
