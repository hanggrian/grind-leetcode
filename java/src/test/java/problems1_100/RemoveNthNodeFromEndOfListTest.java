package problems1_100;

import concepts.SinglyListNode;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class RemoveNthNodeFromEndOfListTest extends SampledTest {
    @Test
    public void test() {
        for (RemoveNthNodeFromEndOfList solution : RemoveNthNodeFromEndOfList.values()) {
            for (RemoveNthNodeFromEndOfListSample sample
                : getSamples(RemoveNthNodeFromEndOfListSample[].class)) {
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
}
