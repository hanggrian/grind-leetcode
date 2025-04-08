package problems201_300;

import concepts.SinglyListNode;
import org.junit.Test;
import sample.SampledTest;

import static com.google.common.truth.Truth.assertWithMessage;

public class PalindromeLinkedListTest extends SampledTest {
    @Test
    public void test() {
        for (PalindromeLinkedList solution : PalindromeLinkedList.values()) {
            for (PalindromeLinkedListSample sample
                : getSamples(PalindromeLinkedListSample[].class)) {
                assertWithMessage(sample.getMessage())
                    .that(solution.isPalindrome(SinglyListNode.of(sample.input.head)))
                    .isEqualTo(sample.output);
            }
        }
    }
}
