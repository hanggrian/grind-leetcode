package problems1_100

import concepts.SinglyListNode
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class MergeKSortedListsTest extends SampledTest {
    @Test
    void test() {
        for (MergeKSortedLists solution : MergeKSortedLists.values()) {
            for (MergeKSortedListsSample sample : getSamples(MergeKSortedListsSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.mergeKLists(
                            Arrays
                                .stream(sample.input.lists)
                                .map(SinglyListNode::of)
                                .toList()
                                .toArray(new SinglyListNode[sample.input.lists.length]),
                        ),
                    ).isEqualTo(SinglyListNode.of(sample.output))
            }
        }
    }
}
