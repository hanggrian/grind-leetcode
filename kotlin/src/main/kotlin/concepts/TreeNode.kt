package concepts

import java.util.LinkedList
import java.util.Objects
import java.util.Queue

class TreeNode : Node {
    var left: TreeNode? = null
    var right: TreeNode? = null

    constructor() : super(0)

    constructor(`val`: Int) : super(`val`)

    constructor(`val`: Int, left: TreeNode?, right: TreeNode?) : super(`val`) {
        this.left = left
        this.right = right
    }

    fun isLeaf(): Boolean = left == null && right == null

    private fun recursiveEquals(node1: TreeNode?, node2: TreeNode?): Boolean {
        if (node1 == null && node2 == null) {
            return true
        }
        if (node1 == null || node2 == null) {
            return false
        }
        return node1.`val` == node2.`val` &&
            recursiveEquals(node1.left, node2.left) &&
            recursiveEquals(node1.right, node2.right)
    }

    override fun equals(other: Any?): Boolean {
        if (other !is TreeNode) {
            return false
        }
        return recursiveEquals(this, other)
    }

    override fun hashCode(): Int = Objects.hashCode(`val`)

    companion object {
        fun of(vararg vals: Int?): TreeNode? {
            if (vals.isEmpty()) {
                return null
            }
            val root = TreeNode(vals[0]!!)
            val queue: Queue<TreeNode> = LinkedList()
            queue += root
            var i = 1
            while (!queue.isEmpty() && i < vals.size) {
                val node = queue.poll()
                var `val` = vals[i]
                if (`val` != null) {
                    node.left = TreeNode(`val`)
                    queue.add(node.left)
                }
                i++
                if (i < vals.size) {
                    `val` = vals[i]
                    if (`val` != null) {
                        node.right = TreeNode(`val`)
                        queue.add(node.right)
                    }
                }
                i++
            }
            return root
        }
    }
}
