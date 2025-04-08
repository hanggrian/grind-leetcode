package problems201_300

import concepts.SinglyListNode
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class RemoveLinkedListElementsTest extends SampledTest {
    @Test
    void test() {
        RemoveLinkedListElements.values().each { solution ->
            getSamples(RemoveLinkedListElementsSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.removeElements(
                            SinglyListNode.of(sample.input.head),
                            sample.input.k,
                        )
                    ).isEqualTo(SinglyListNode.of(sample.output))
            }
        }
    }
}
