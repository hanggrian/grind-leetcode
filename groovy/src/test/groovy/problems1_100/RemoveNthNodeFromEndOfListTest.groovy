package problems1_100

import concepts.SinglyListNode
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class RemoveNthNodeFromEndOfListTest extends SampledTest {
    @Test
    void test() {
        RemoveNthNodeFromEndOfList.values().each { solution ->
            getSamples(RemoveNthNodeFromEndOfListSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.removeNthFromEnd(
                            SinglyListNode.of(sample.input.head),
                            sample.input.n,
                        ),
                    ).isEqualTo(SinglyListNode.of(sample.output))
            }
        }
    }
}
