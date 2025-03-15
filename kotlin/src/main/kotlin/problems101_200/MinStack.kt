package problems101_200

import java.util.Stack

class MinStack {
    var main = Stack<Int>()
    var mins = Stack<Int>()

    fun push(value: Int) {
        main.push(value)
        if (value <= minimum) {
            mins.push(value)
        }
    }

    val minimum: Int
        get() =
            if (mins.isEmpty()) {
                Int.MAX_VALUE
            } else {
                mins.peek()
            }

    fun pop() {
        val value = main.pop()
        if (value == minimum) {
            mins.pop()
        }
    }

    fun top(): Int = main.peek()
}
