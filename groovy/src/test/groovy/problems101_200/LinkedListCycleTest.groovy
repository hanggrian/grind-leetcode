package problems101_200

import com.google.common.collect.Iterables
import concepts.SinglyListNode
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class LinkedListCycleTest extends SampledTest {
    @Test
    void test() {
        LinkedListCycle.values().each { solution ->
            getSamples(LinkedListCycleSample[].class).each { sample ->
                var head = SinglyListNode.of(sample.input.head)
                if (sample.input.pos > -1) {
                    Iterables.getLast(head).next = Iterables.get(head, sample.input.pos)
                }
                assertWithMessage(sample.getMessage())
                    .that(solution.hasCycle(head))
                    .isEqualTo(sample.output)
            }
        }
    }
}
