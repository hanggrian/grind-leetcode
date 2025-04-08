package concepts

open class ListNode<T : ListNode<T>>(value: Int) :
    Node(value),
    Iterable<T> {
    var next: T? = null

    override fun iterator(): Iterator<T> = ListNodeIterator(this as T)

    override fun equals(other: Any?): Boolean {
        if (other !is ListNode<*>) {
            return false
        }
        var node1: ListNode<T>? = this
        var node2: ListNode<T>? = other as? ListNode<T>
        while (node1 != null && node2 != null) {
            if (node1.`val` != node2.`val`) {
                return false
            }
            node1 = node1.next
            node2 = node2.next
        }
        return node1 == null && node2 == null
    }

    override fun hashCode(): Int = `val`.hashCode()

    private inner class ListNodeIterator(private var current: T?) : Iterator<T> {
        override fun hasNext(): Boolean = current != null

        override fun next(): T {
            val temp = current!!
            current = current?.next
            return temp
        }
    }
}
