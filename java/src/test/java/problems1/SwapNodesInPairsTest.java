package problems1;

import concepts.SinglyListNode;
import org.junit.Test;
import testing.Sample;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class SwapNodesInPairsTest extends SampledTest {
    @Override
    public String getFileName() {
        return "swap_nodes_in_pairs.json";
    }

    @Test
    public void test() {
        for (SwapNodesInPairs solution : SwapNodesInPairs.values()) {
            for (TypedSample sample : getSamples(TypedSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.swapPairs(SinglyListNode.of(sample.input.head)))
                    .isEqualTo(SinglyListNode.of(sample.output));
            }
        }
    }

    public static class TypedSample extends Sample<TypedSample.Input, int[]> {
        public static class Input {
            public int[] head;
        }
    }
}
