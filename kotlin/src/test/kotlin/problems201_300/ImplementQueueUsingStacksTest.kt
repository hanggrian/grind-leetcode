package problems201_300

import com.google.common.truth.Truth.assertThat
import sample.SampledTest
import sample.component1
import sample.component2
import sample.component3
import sample.getSamples
import kotlin.test.Test

class ImplementQueueUsingStacksTest : SampledTest() {
    @Test
    fun test() {
        getSamples<Array<ImplementQueueUsingStacksSample>>().forEach { (input, output, message) ->
            lateinit var queue: ImplementQueueUsingStacks
            for (i in input.moveNames.indices) {
                val values = input.moveValues[i]
                when (input.moveNames[i]) {
                    "MyQueue" -> {
                        queue = ImplementQueueUsingStacks()
                        assertThat(output[i])
                            .isNull()
                    }

                    "push" -> {
                        queue.push(values[0])
                        assertThat(output[i])
                            .isNull()
                    }

                    "peek" ->
                        assertThat(output[i])
                            .isEqualTo(queue.peek())

                    "pop" ->
                        assertThat(output[i])
                            .isEqualTo(queue.pop())

                    "empty" ->
                        assertThat(output[i])
                            .isEqualTo(queue.empty())
                }
            }
        }
    }
}
