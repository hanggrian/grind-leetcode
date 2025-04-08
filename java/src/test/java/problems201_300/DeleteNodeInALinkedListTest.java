package problems201_300;

import concepts.SinglyListNode;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class DeleteNodeInALinkedListTest extends SampledTest {
    @Test
    public void test() {
        for (DeleteNodeInALinkedList solution : DeleteNodeInALinkedList.values()) {
            for (DeleteNodeInALinkedListSample sample
                : getSamples(DeleteNodeInALinkedListSample[].class)) {
                SinglyListNode head = SinglyListNode.of(sample.input.head);
                if (sample.input.node > -1) {
                    solution.deleteNode(
                        head
                            .stream()
                            .filter(n -> n.val == sample.input.node)
                            .findFirst()
                            .get()
                    );
                }
                assertWithMessage(sample.getMessage())
                    .that(head)
                    .isEqualTo(SinglyListNode.of(sample.output));
            }
        }
    }
}
