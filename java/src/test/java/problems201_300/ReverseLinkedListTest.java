package problems201_300;

import concepts.SinglyListNode;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class ReverseLinkedListTest extends SampledTest {
    @Test
    public void test() {
        for (ReverseLinkedList solution : ReverseLinkedList.values()) {
            for (ReverseLinkedListSample sample : getSamples(ReverseLinkedListSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.reverseList(SinglyListNode.of(sample.input.head)))
                    .isEqualTo(SinglyListNode.of(sample.output));
            }
        }
    }
}
