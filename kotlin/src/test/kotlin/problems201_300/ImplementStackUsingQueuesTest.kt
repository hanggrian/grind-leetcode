package problems201_300

import com.google.common.truth.Truth.assertThat
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class ImplementStackUsingQueuesTest : SampledTest() {
    @Test
    fun test() =
        getSamples<Array<ImplementStackUsingQueuesSample>>().forEach { (input, output, _) ->
            lateinit var stack: ImplementStackUsingQueues
            for (i in input.moveNames.indices) {
                val values = input.moveValues[i]
                when (input.moveNames[i]) {
                    "MyStack" -> {
                        stack = ImplementStackUsingQueues()
                        assertThat(output[i])
                            .isNull()
                    }
                    "push" -> {
                        stack.push(values[0])
                        assertThat(output[i])
                            .isNull()
                    }
                    "top" ->
                        assertThat(output[i])
                            .isEqualTo(stack.top())
                    "pop" ->
                        assertThat(output[i])
                            .isEqualTo(stack.pop())
                    "empty" ->
                        assertThat(output[i])
                            .isEqualTo(stack.empty())
                }
            }
        }
}
