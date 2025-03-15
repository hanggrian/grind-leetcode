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
                SinglyListNode input = SinglyListNode.of(sample.input.head)
                SinglyListNode output = null
                if (sample.input.pos > -1) {
                    output = Iterables.get(input, sample.input.pos)
                    Iterables.getLast(input).next = output
                }
                assertWithMessage(sample.getMessage())
                    .that(solution.detectCycle(input))
                    .isEqualTo(output)
            }
        }
    }
}
