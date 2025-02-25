package problems1_100;

import concepts.SinglyListNode;
import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class MergeTwoSortedListsTest extends SampledTest {
    @Test
    public void test() {
        for (MergeTwoSortedLists solution : MergeTwoSortedLists.values()) {
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

    static class TypedSample extends Sample<TypedSample.Input, int[]> {
        static class Input {
            int[] list1;
            int[] list2;
        }
    }
}
