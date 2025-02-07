import com.google.common.collect.Iterables;
import org.junit.Test;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class LinkedListCycleTest extends SampledTest {
    @Override
    public String getFileName() {
        return "linked_list_cycle.json";
    }

    @Test
    public void test() {
        for (Sample sample : getSamples(Sample[].class)) {
            SinglyListNode node = SinglyListNode.of(sample.input.head);
            if (sample.input.pos > -1) {
                Iterables.getLast(node).next = Iterables.get(node, sample.input.pos);
            }
            for (LinkedListCycle solution : LinkedListCycle.values()) {
                assertWithMessage(sample.explanation)
                    .that(solution.hasCycle(node))
                    .isEqualTo(sample.output);
            }
        }
    }

    public static class Sample {
        public Input input;
        public boolean output;
        public String explanation;

        public static class Input {
            public int[] head;
            public int pos;
        }
    }
}
