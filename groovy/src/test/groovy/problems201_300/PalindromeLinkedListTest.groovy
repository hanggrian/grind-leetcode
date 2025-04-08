package problems201_300

import concepts.SinglyListNode
import org.junit.Test
import sample.SampledTest

import static com.google.common.truth.Truth.assertWithMessage

class PalindromeLinkedListTest extends SampledTest {
    @Test
    void test() {
        PalindromeLinkedList.values().each { solution ->
            getSamples(PalindromeLinkedListSample[].class).each { sample ->
                assertWithMessage(sample.getMessage())
                    .that(solution.isPalindrome(SinglyListNode.of(sample.input.head)))
                    .isEqualTo(sample.output)
            }
        }
    }
}
