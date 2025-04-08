package problems201_300

import java.util.LinkedList
import java.util.Queue

class ImplementStackUsingQueues {
    private val queue1 = LinkedList<Int>()
    private val queue2 = LinkedList<Int>()

    fun push(x: Int) {
        if (empty()) {
            queue1.add(x)
        } else if (queue1.isEmpty()) {
            queue2.add(x)
        } else {
            queue1.add(x)
        }
    }

    fun pop(): Int {
        val primary = primary
        val secondary = secondary
        while (primary.size > 1) {
            secondary.add(primary.remove())
        }
        return primary.remove()
    }

    fun top(): Int {
        val primary = primary
        val secondary = secondary
        while (primary.size > 1) {
            secondary.add(primary.remove())
        }
        val value = primary.remove()
        secondary.add(value)
        return value
    }

    fun empty(): Boolean = queue1.isEmpty() && queue2.isEmpty()

    private val primary: Queue<Int>
        get() = if (queue1.isEmpty()) queue2 else queue1

    private val secondary: Queue<Int>
        get() = if (queue1.isEmpty()) queue1 else queue2
}
