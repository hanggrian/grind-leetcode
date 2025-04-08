package problems101_200;

import com.google.common.collect.Iterables;
import concepts.SinglyListNode;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class LinkedListCycle2Test extends SampledTest {
    @Override
    protected String getSampleFilename() {
        return "linked-list-cycle-ii.json";
    }

    @Test
    public void test() {
        for (LinkedListCycle2 solution : LinkedListCycle2.values()) {
            for (LinkedListCycle2Sample sample : getSamples(LinkedListCycle2Sample[].class)) {
                SinglyListNode head = SinglyListNode.of(sample.input.head);
                SinglyListNode result = null;
                if (sample.input.pos > -1) {
                    result = Iterables.get(head, sample.input.pos);
                    Iterables.getLast(head).next = result;
                }
                assertWithMessage(sample.getMessage())
                    .that(solution.detectCycle(head))
                    .isEqualTo(result);
            }
        }
    }
}
