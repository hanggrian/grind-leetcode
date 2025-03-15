package concepts

import java.util.LinkedList
import java.util.Objects
import java.util.Queue

class TreeNode : Node {
    var left: TreeNode? = null
    var right: TreeNode? = null

    constructor() : super(0)

    constructor(value: Int) : super(value)

    constructor(value: Int, left: TreeNode?, right: TreeNode?) : super(value) {
        this.left = left
        this.right = right
    }

    fun hasLeft(): Boolean = left != null

    fun hasRight(): Boolean = right != null

    fun isLeaf(): Boolean = left == null && right == null

    private fun recursiveEquals(node1: TreeNode?, node2: TreeNode?): Boolean {
        if (node1 == null && node2 == null) {
            return true
        }
        if (node1 == null || node2 == null) {
            return false
        }
        return node1.value == node2.value &&
            recursiveEquals(node1.left, node2.left) &&
            recursiveEquals(node1.right, node2.right)
    }

    override fun equals(other: Any?): Boolean {
        if (other !is TreeNode) {
            return false
        }
        return recursiveEquals(this, other)
    }

    override fun hashCode(): Int = Objects.hashCode(value)

    companion object {
        fun of(vararg values: Int?): TreeNode? {
            if (values.isEmpty()) {
                return null
            }
            val root = TreeNode(values[0]!!)
            val queue: Queue<TreeNode> = LinkedList()
            queue += root
            var i = 1
            while (!queue.isEmpty() && i < values.size) {
                val node = queue.poll()
                if (i < values.size && values[i] != null) {
                    node!!.left = TreeNode(values[i]!!)
                    queue += node.left
                }
                i++
                if (i < values.size && values[i] != null) {
                    node!!.right = TreeNode(values[i]!!)
                    queue += node.right
                }
                i++
            }
            return root
        }
    }
}
