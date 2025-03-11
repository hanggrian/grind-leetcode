package problems1_100

import com.google.common.truth.Truth.assertWithMessage
import concepts.SinglyListNode
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import kotlin.test.Test

class RotateListTest : SampledTest() {
    @Test
    fun test() =
        RotateList.entries.forEach { solution ->
            getSamples(Array<RotateListSample>::class.java)
                .forEach { (input, output, message) ->
                    assertWithMessage(message)
                        .that(solution.rotateRight(SinglyListNode.of(*input.head), input.k))
                        .isEqualTo(SinglyListNode.of(*output))
                }
        }
}
