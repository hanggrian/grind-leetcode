package problems201_300

import com.google.common.truth.Truth.assertWithMessage
import concepts.SinglyListNode
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class PalindromeLinkedListTest : SampledTest() {
    @Test
    fun test() =
        PalindromeLinkedList.entries.forEach { solution ->
            getSamples<Array<PalindromeLinkedListSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.isPalindrome(SinglyListNode.of(*input.head)))
                    .isEqualTo(output)
            }
        }
}
