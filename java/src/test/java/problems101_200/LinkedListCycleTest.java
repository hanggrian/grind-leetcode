package problems101_200;

import com.google.common.collect.Iterables;
import concepts.SinglyListNode;
import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class LinkedListCycleTest extends SampledTest {
    @Test
    public void test() {
        for (LinkedListCycle solution : LinkedListCycle.values()) {
            for (TypedSample sample : getSamples(TypedSample[].class)) {
                SinglyListNode input = SinglyListNode.of(sample.input.head);
                if (sample.input.pos > -1) {
                    Iterables.getLast(input).next = Iterables.get(input, sample.input.pos);
                }
                assertWithMessage(sample.getMessage())
                    .that(solution.hasCycle(input))
                    .isEqualTo(sample.output);
            }
        }
    }

    static class TypedSample extends Sample<TypedSample.Input, Boolean> {
        static class Input {
            int[] head;
            int pos;
        }
    }
}
