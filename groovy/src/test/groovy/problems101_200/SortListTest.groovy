package problems101_200

import concepts.SinglyListNode
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class SortListTest extends SampledTest {
    @Test
    void test() {
        SortList.values().each { solution ->
            getSamples(SortListSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.sortList(SinglyListNode.of(sample.input.head)))
                    .isEqualTo(SinglyListNode.of(sample.output))
            }
        }
    }
}
