package concepts

class SinglyListNode : ListNode<SinglyListNode> {
    constructor() : super(0)

    constructor(`val`: Int) : super(`val`)

    constructor(`val`: Int, next: SinglyListNode?) : super(`val`) {
        this.next = next
    }

    companion object {
        val ZERO = SinglyListNode(0)

        fun of(vararg vals: Int): SinglyListNode? {
            if (vals.isEmpty()) {
                return null
            }
            val head = SinglyListNode(vals[0])
            var next = head
            for (i in 1 until vals.size) {
                next.next = SinglyListNode(vals[i])
                next = next.next!!
            }
            return head
        }
    }
}
