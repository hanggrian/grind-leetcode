package concepts

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
