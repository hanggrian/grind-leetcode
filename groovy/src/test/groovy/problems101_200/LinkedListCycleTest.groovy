package problems101_200

import com.google.common.collect.Iterables
import concepts.SinglyListNode
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class LinkedListCycleTest extends SampledTest {
    @Test
    void test() {
        for (LinkedListCycle solution : LinkedListCycle.values()) {
            for (LinkedListCycleSample sample : getSamples(LinkedListCycleSample[].class)) {
                SinglyListNode input = SinglyListNode.of(sample.input.head)
                if (sample.input.pos > -1) {
                    Iterables.getLast(input).next = Iterables.get(input, sample.input.pos)
                }
                assertWithMessage(sample.getMessage())
                    .that(solution.hasCycle(input))
                    .isEqualTo(sample.output)
            }
        }
    }
}
