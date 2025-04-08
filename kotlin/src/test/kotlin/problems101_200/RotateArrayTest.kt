package problems101_200

import com.google.common.truth.Truth.assertWithMessage
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class RotateArrayTest : SampledTest() {
    @Test
    fun test() =
        RotateArray.entries.forEach { solution ->
            getSamples<Array<RotateArraySample>>().forEach { (input, output, message) ->
                assertWithMessage(message)
                    .that(input.nums.also { solution.rotate(it, input.k) })
                    .isEqualTo(output)
            }
        }
}
