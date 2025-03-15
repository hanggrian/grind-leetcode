package problems101_200

import concepts.TreeNode
import kotlin.math.abs
import kotlin.math.max

enum class BalancedBinaryTree {
    DEFAULT {
        override fun isBalanced(root: TreeNode?): Boolean {
            if (root == null) {
                return true
            }
            if (abs((maxDepth(root.left, 1) - maxDepth(root.right, 1)).toDouble()) > 1) {
                return false
            }
            return isBalanced(root.left) && isBalanced(root.right)
        }

        fun maxDepth(node: TreeNode?, depth: Int): Int {
            if (node == null) {
                return depth
            }
            val leftDepth = maxDepth(node.left, depth + 1)
            val rightDepth = maxDepth(node.right, depth + 1)
            return max(leftDepth, rightDepth)
        }
    },
    ;

    abstract fun isBalanced(root: TreeNode?): Boolean
}
