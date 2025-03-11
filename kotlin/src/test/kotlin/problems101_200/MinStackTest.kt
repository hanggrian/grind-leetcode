package problems101_200

import com.google.common.truth.Truth.assertThat
import sample.SampledTest
import kotlin.test.Test

class MinStackTest : SampledTest() {
    @Test
    fun test() {
        val stack = MinStack()
        stack.push(-2)
        stack.push(0)
        stack.push(-3)
        assertThat(stack.minimum)
            .isEqualTo(-3)

        stack.pop()
        assertThat(stack.top())
            .isEqualTo(0)
        assertThat(stack.minimum)
            .isEqualTo(-2)
    }
}
