package problems101_200

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import kotlin.test.Test

class SingleNumberTest : SampledTest() {
    @Test
    fun test() =
        SingleNumber.entries.forEach { solution ->
            getSamples(Array<SingleNumberSample>::class.java).forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(solution.singleNumber(input.nums))
                    .isEqualTo(output)
            }
        }
}
