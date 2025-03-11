package problems1_100;

import concepts.SinglyListNode;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class ReverseLinkedList2Test extends SampledTest {
    @Override
    protected String getSampleFilename() {
        return "reverse-linked-list-ii.json";
    }

    @Test
    public void test() {
        for (ReverseLinkedList2 solution : ReverseLinkedList2.values()) {
            for (ReverseLinkedList2Sample sample : getSamples(ReverseLinkedList2Sample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.reverseBetween(
                            SinglyListNode.of(sample.input.head),
                            sample.input.left,
                            sample.input.right
                        )
                    ).isEqualTo(SinglyListNode.of(sample.output));
            }
        }
    }
}
