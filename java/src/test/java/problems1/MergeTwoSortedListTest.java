package problems1;

import concepts.SinglyListNode;
import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class MergeTwoSortedListTest extends SampledTest {
    @Override
    public String getFileName() {
        return "merge_two_sorted_lists.json";
    }

    @Test
    public void test() {
        for (MergeTwoSortedList solution : MergeTwoSortedList.values()) {
            for (TypedSample sample : getSamples(TypedSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.mergeTwoLists(
                            SinglyListNode.of(sample.input.list1),
                            SinglyListNode.of(sample.input.list2)
                        )
                    ).isEqualTo(SinglyListNode.of(sample.output));
            }
        }
    }

    public static class TypedSample extends Sample<TypedSample.Input, int[]> {
        public static class Input {
            public int[] list1;
            public int[] list2;
        }
    }
}
