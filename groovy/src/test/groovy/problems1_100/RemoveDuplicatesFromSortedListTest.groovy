package problems1_100

import concepts.SinglyListNode
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class RemoveDuplicatesFromSortedListTest extends SampledTest {
    @Test
    void test() {
        RemoveDuplicatesFromSortedList.values().each { solution ->
            getSamples(RemoveDuplicatesFromSortedListSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.deleteDuplicates(SinglyListNode.of(sample.input.head)))
                    .isEqualTo(SinglyListNode.of(sample.output))
            }
        }
    }
}
