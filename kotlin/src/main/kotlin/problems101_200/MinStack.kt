package problems101_200

import java.util.Stack

class MinStack {
    var main = Stack<Int>()
    var mins = Stack<Int>()

    fun push(`val`: Int) {
        main.push(`val`)
        if (`val` <= minimum) {
            mins.push(`val`)
        }
    }

    val minimum: Int
        get() {
            if (mins.isEmpty()) {
                return Int.MAX_VALUE
            }
            return mins.peek()
        }

    fun pop() {
        val `val` = main.pop()
        if (`val` == minimum) {
            mins.pop()
        }
    }

    fun top(): Int = main.peek()
}
