package problems1_100

import concepts.SinglyListNode
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class MergeTwoSortedListsTest extends SampledTest {
    @Test
    void test() {
        MergeTwoSortedLists.values().each { solution ->
            getSamples(MergeTwoSortedListsSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(
                        solution.mergeTwoLists(
                            SinglyListNode.of(sample.input.list1),
                            SinglyListNode.of(sample.input.list2),
                        ),
                    ).isEqualTo(SinglyListNode.of(sample.output))
            }
        }
    }
}
