package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import concepts.SinglyListNode
import sample.SampledTest
import kotlin.test.Test

class AddTwoNumbersTest : SampledTest() {
    @Test
    fun test() {
        for (solution in AddTwoNumbers.entries) {
            for (sample in getSamples(Array<AddTwoNumbersSample>::class.java)) {
                assertWithMessage(sample.message)
                    .that(
                        solution.addTwoNumbers(
                            SinglyListNode.of(*sample.input!!.l1),
                            SinglyListNode.of(*sample.input!!.l2),
                        ),
                    ).isEqualTo(SinglyListNode.of(*sample.output!!))
            }
        }
    }
}
