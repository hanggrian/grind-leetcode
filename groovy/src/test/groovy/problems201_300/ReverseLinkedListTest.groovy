package problems201_300

import concepts.SinglyListNode
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class ReverseLinkedListTest extends SampledTest {
    @Test
    void test() {
        ReverseLinkedList.values().each { solution ->
            getSamples(ReverseLinkedListSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.reverseList(SinglyListNode.of(sample.input.head)))
                    .isEqualTo(SinglyListNode.of(sample.output))
            }
        }
    }
}
