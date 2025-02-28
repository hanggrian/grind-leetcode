package problems1_100;

import concepts.SinglyListNode;
import java.util.Arrays;
import org.junit.Test;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class MergeKSortedListsTest extends SampledTest {
    @Test
    public void test() {
        for (MergeKSortedLists solution : MergeKSortedLists.values()) {
            for (MergeKSortedListsSample sample : getSamples(MergeKSortedListsSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.mergeKLists(
                            Arrays
                                .stream(sample.input.lists)
                                .map(SinglyListNode::of)
                                .toList()
                                .toArray(new SinglyListNode[sample.input.lists.length])
                        )
                    ).isEqualTo(SinglyListNode.of(sample.output));
            }
        }
    }
}
