package problems1_100

import concepts.SinglyListNode
import org.junit.Test
import testing.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class RemoveNthNodeFromEndOfListTest extends SampledTest {
    @Test
    void test() {
        for (RemoveNthNodeFromEndOfList solution : RemoveNthNodeFromEndOfList.values()) {
            for (RemoveNthNodeFromEndOfListSample sample : getSamples(RemoveNthNodeFromEndOfListSample[].class)) {
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
