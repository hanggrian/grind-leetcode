package problems1_100;

import concepts.SinglyListNode;
import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class RemoveNthNodeFromEndOfListTest extends SampledTest {
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

    static class TypedSample extends Sample<TypedSample.Input, int[]> {
        static class Input {
            int[] head;
            int n;
        }
    }
}
