package problems301_400

import concepts.SinglyListNode
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class OddEvenLinkedListTest extends SampledTest {
    @Test
    void test() {
        OddEvenLinkedList.values().each { solution ->
            getSamples(OddEvenLinkedListSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.oddEvenList(SinglyListNode.of(sample.input.head)))
                    .isEqualTo(SinglyListNode.of(sample.output))
            }
        }
    }
}
