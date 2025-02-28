package concepts

class SinglyListNode : ListNode<SinglyListNode> {
    constructor() : super(0)

    constructor(value: Int) : super(value)

    constructor(value: Int, next: SinglyListNode) : super(value) {
        this.next = next
    }

    companion object {
        val ZERO = SinglyListNode(0)

        fun of(vararg values: Int): SinglyListNode? {
            if (values.isEmpty()) {
                return null
            }
            val head = SinglyListNode(values[0])
            var next = head
            for (i in 1 until values.size) {
                next.next = SinglyListNode(values[i])
                next = next.next!!
            }
            return head
        }
    }
}

class DoublyListNode : ListNode<DoublyListNode> {
    var prev: DoublyListNode? = null

    constructor() : super(0)

    constructor(value: Int) : super(value)

    constructor(value: Int, next: DoublyListNode) : super(value) {
        this.next = next
    }

    constructor(value: Int, next: DoublyListNode, prev: DoublyListNode) : super(value) {
        this.next = next
        this.prev = prev
    }

    companion object {
        fun of(vararg values: Int): DoublyListNode? {
            if (values.isEmpty()) {
                return null
            }
            val head = DoublyListNode(values[0])
            var prev: DoublyListNode? = null
            var next = head
            for (i in 1 until values.size) {
                val temp = next

                next.prev = prev
                next.next = DoublyListNode(values[i])
                next = next.next!!

                prev = temp
            }
            return head
        }
    }
}

open class ListNode<T : ListNode<T>>(var value: Int) : Iterable<T> {
    var next: T? = null

    fun hasNext(): Boolean = next != null

    override fun iterator(): Iterator<T> = ListNodeIterator(this as T)

    override fun equals(other: Any?): Boolean {
        if (other !is ListNode<*>) {
            return false
        }
        var node1: ListNode<T>? = this
        var node2: ListNode<T>? = other as? ListNode<T>
        while (node1 != null && node2 != null) {
            if (node1.value != node2.value) {
                return false
            }
            node1 = node1.next
            node2 = node2.next
        }
        return node1 == null && node2 == null
    }

    override fun hashCode(): Int = value.hashCode()

    private inner class ListNodeIterator(private var current: T?) : Iterator<T> {
        override fun hasNext(): Boolean = current != null

        override fun next(): T {
            val temp = current!!
            current = current?.next
            return temp
        }
    }
}
