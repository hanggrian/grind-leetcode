package problems1_100

import concepts.SinglyListNode
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class MergeKSortedListsTest extends SampledTest {
    @Test
    void test() {
        MergeKSortedLists.values().each { solution ->
            getSamples(MergeKSortedListsSample[].class).each { sample ->
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
