package problems101_200

import concepts.SinglyListNode
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class ReorderListTest extends SampledTest {
    @Test
    void test() {
        ReorderList.values().each { solution ->
            getSamples(ReorderListSample[].class).each { sample ->
                SinglyListNode input = SinglyListNode.of(sample.input.head)
                solution.reorderList(input)
                assertWithMessage(sample.getMessage())
                    .that(input)
                    .isEqualTo(SinglyListNode.of(sample.output))
            }
        }
    }
}
