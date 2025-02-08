import com.google.common.collect.Iterables;
import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class LinkedListCycleTest extends SampledTest {
    @Override
    public String getFileName() {
        return "linked_list_cycle.json";
    }

    @Test
    public void test() {
        for (TypedSample sample : getSamples(TypedSample[].class)) {
            SinglyListNode node = SinglyListNode.of(sample.input.head);
            if (sample.input.pos > -1) {
                Iterables.getLast(node).next = Iterables.get(node, sample.input.pos);
            }
            for (LinkedListCycle solution : LinkedListCycle.values()) {
                assertWithMessage(sample.getMessage())
                    .that(solution.hasCycle(node))
                    .isEqualTo(sample.output);
            }
        }
    }

    public static class TypedSample extends Sample<TypedSample.Input, Boolean> {
        public static class Input {
            public int[] head;
            public int pos;
        }
    }
}
