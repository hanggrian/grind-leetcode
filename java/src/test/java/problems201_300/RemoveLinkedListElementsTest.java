package problems201_300;

import concepts.SinglyListNode;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class RemoveLinkedListElementsTest extends SampledTest {
    @Test
    public void test() {
        for (RemoveLinkedListElements solution : RemoveLinkedListElements.values()) {
            for (RemoveLinkedListElementsSample sample
                : getSamples(RemoveLinkedListElementsSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.removeElements(
                            SinglyListNode.of(sample.input.head),
                            sample.input.k
                        )
                    ).isEqualTo(SinglyListNode.of(sample.output));
            }
        }
    }
}
