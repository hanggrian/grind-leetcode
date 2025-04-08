package problems101_200

import com.google.common.collect.Iterables
import concepts.SinglyListNode
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class LinkedListCycle2Test extends SampledTest {
    @Override
    protected String getSampleFilename() {
        return 'linked-list-cycle-ii.json'
    }

    @Test
    void test() {
        LinkedListCycle2.values().each { solution ->
            getSamples(LinkedListCycle2Sample[].class).each { sample ->
                var head = SinglyListNode.of(sample.input.head)
                var result = null
                if (sample.input.pos > -1) {
                    result = Iterables.get(head, sample.input.pos)
                    Iterables.getLast(head).next = result
                }
                assertWithMessage(sample.getMessage())
                    .that(solution.detectCycle(head))
                    .isEqualTo(result)
            }
        }
    }
}
