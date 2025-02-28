package problems1_100;

import concepts.SinglyListNode;
import org.junit.Test;
import testing.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class SwapNodesInPairsTest extends SampledTest {
    @Test
    public void test() {
        for (SwapNodesInPairs solution : SwapNodesInPairs.values()) {
            for (SwapNodesInPairsSample sample : getSamples(SwapNodesInPairsSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.swapPairs(SinglyListNode.of(sample.input.head)))
                    .isEqualTo(SinglyListNode.of(sample.output));
            }
        }
    }
}
