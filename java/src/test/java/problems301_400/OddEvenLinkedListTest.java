package problems301_400;

import concepts.SinglyListNode;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class OddEvenLinkedListTest extends SampledTest {
    @Test
    public void test() {
        for (OddEvenLinkedList solution : OddEvenLinkedList.values()) {
            for (OddEvenLinkedListSample sample : getSamples(OddEvenLinkedListSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.oddEvenList(SinglyListNode.of(sample.input.head)))
                    .isEqualTo(SinglyListNode.of(sample.output));
            }
        }
    }
}
