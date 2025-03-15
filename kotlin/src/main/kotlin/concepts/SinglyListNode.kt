package concepts

class SinglyListNode : ListNode<SinglyListNode> {
    constructor() : super(0)

    constructor(value: Int) : super(value)

    constructor(value: Int, next: SinglyListNode?) : super(value) {
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
