package problems1;

import concepts.SinglyListNode;
import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class RemoveNthNodeFromEndOfListTest extends SampledTest {
    @Override
    public String getFileName() {
        return "remove_nth_node_from_end_of_list.json";
    }

    @Test
    public void test() {
        for (RemoveNthNodeFromEndOfList solution : RemoveNthNodeFromEndOfList.values()) {
            for (TypedSample sample : getSamples(TypedSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.removeNthFromEnd(
                            SinglyListNode.of(sample.input.head),
                            sample.input.n
                        )
                    ).isEqualTo(SinglyListNode.of(sample.output));
            }
        }
    }

    public static class TypedSample extends Sample<TypedSample.Input, int[]> {
        public static class Input {
            public int[] head;
            public int n;
        }
    }
}
