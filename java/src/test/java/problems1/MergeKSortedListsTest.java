package problems1;

import concepts.SinglyListNode;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class MergeKSortedListsTest extends SampledTest {
    @Override
    public String getFileName() {
        return "merge_k_sorted_lists.json";
    }

    @Test
    public void test() {
        for (MergeKSortedLists solution : MergeKSortedLists.values()) {
            for (TypedSample sample : getSamples(TypedSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.mergeKLists(
                            Arrays
                                .stream(sample.input.lists)
                                .map(SinglyListNode::of)
                                .collect(Collectors.toList())
                                .toArray(new SinglyListNode[sample.input.lists.length])
                        )
                    ).isEqualTo(SinglyListNode.of(sample.output));
            }
        }
    }

    public static class TypedSample extends Sample<TypedSample.Input, int[]> {
        public static class Input {
            public int[][] lists;
        }
    }
}
