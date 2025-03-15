package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import concepts.SinglyListNode
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class AddTwoNumbersTest : SampledTest() {
    @Test
    fun test() =
        AddTwoNumbers.entries.forEach { solution ->
            getSamples<Array<AddTwoNumbersSample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(
                        solution.addTwoNumbers(
                            SinglyListNode.of(*input.l1),
                            SinglyListNode.of(*input.l2),
                        ),
                    ).isEqualTo(SinglyListNode.of(*output!!))
            }
        }
}
