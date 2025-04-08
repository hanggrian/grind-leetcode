package problems101_200

import com.google.common.truth.Truth.assertThat
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class MinStackTest : SampledTest() {
    @Test
    fun test() =
        getSamples<Array<MinStackSample>>().forEach { (input, output, _) ->
            lateinit var stack: MinStack
            for (i in input.moveNames.indices) {
                val values = input.moveValues[i]
                when (input.moveNames[i]) {
                    "MinStack" -> {
                        stack = MinStack()
                        assertThat(output[i])
                            .isNull()
                    }

                    "push" -> {
                        stack.push(values[0])
                        assertThat(output[i])
                            .isNull()
                    }

                    "getMininimum" ->
                        assertThat(output[i])
                            .isEqualTo(stack.minimum)

                    "pop" -> {
                        stack.pop()
                        assertThat(output[i])
                            .isNull()
                    }

                    "top" ->
                        assertThat(output[i])
                            .isEqualTo(stack.top())
                }
            }
        }
}
