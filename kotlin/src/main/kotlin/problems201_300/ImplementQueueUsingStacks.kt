package problems201_300

import java.util.Stack

class ImplementQueueUsingStacks {
    private val pushStack = Stack<Int>()
    private val popStack = Stack<Int>()

    fun push(x: Int) {
        pushStack.push(x)
    }

    fun pop(): Int {
        fillPopStack()
        return popStack.pop()
    }

    fun peek(): Int {
        fillPopStack()
        return popStack.peek()
    }

    fun empty(): Boolean = pushStack.isEmpty() && popStack.isEmpty()

    private fun fillPopStack() {
        if (!popStack.isEmpty()) {
            return
        }
        while (!pushStack.isEmpty()) {
            popStack.push(pushStack.pop())
        }
    }
}
