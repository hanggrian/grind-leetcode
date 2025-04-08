package concepts

class DoublyListNode : ListNode<DoublyListNode> {
    var prev: DoublyListNode? = null

    constructor() : super(0)

    constructor(`val`: Int) : super(`val`)

    constructor(`val`: Int, next: DoublyListNode) : super(`val`) {
        this.next = next
    }

    constructor(`val`: Int, next: DoublyListNode, prev: DoublyListNode) : super(`val`) {
        this.next = next
        this.prev = prev
    }

    companion object {
        fun of(vararg vals: Int): DoublyListNode? {
            if (vals.isEmpty()) {
                return null
            }
            val head = DoublyListNode(vals[0])
            var prev: DoublyListNode? = null
            var next = head
            for (i in 1 until vals.size) {
                val temp = next

                next.prev = prev
                next.next = DoublyListNode(vals[i])
                next = next.next!!

                prev = temp
            }
            return head
        }
    }
}
