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
                SinglyListNode input = SinglyListNode.of(sample.input.head);
                SinglyListNode output = null;
                if (sample.input.pos > -1) {
                    output = Iterables.get(input, sample.input.pos);
                    Iterables.getLast(input).next = output;
                }
                assertWithMessage(sample.getMessage())
                    .that(solution.detectCycle(input))
                    .isEqualTo(output);
            }
        }
    }
}
