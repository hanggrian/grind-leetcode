package problems201_300

import com.google.common.truth.Truth.assertWithMessage
import concepts.SinglyListNode
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class RemoveLinkedListElementsTest : SampledTest() {
    @Test
    fun test() =
        RemoveLinkedListElements.entries.forEach { solution ->
            getSamples<Array<RemoveLinkedListElementsSample>>()
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(solution.removeElements(SinglyListNode.of(*input.head), input.k))
                        .isEqualTo(SinglyListNode.of(*output))
                }
        }
}
