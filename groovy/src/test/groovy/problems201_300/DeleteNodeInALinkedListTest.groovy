package problems201_300

import concepts.SinglyListNode
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class DeleteNodeInALinkedListTest extends SampledTest {
    @Test
    void test() {
        DeleteNodeInALinkedList.values().each { solution ->
            getSamples(DeleteNodeInALinkedListSample[].class).each { sample ->
                var head = SinglyListNode.of(sample.input.head)
                if (sample.input.node > -1) {
                    solution.deleteNode(
                        head
                            .findAll { n -> n.val == sample.input.node }
                            .getFirst(),
                    )
                }
                assertWithMessage(sample.getMessage())
                    .that(head)
                    .isEqualTo(SinglyListNode.of(sample.output))
            }
        }
    }
}
