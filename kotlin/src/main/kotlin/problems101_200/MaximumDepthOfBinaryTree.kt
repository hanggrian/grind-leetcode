package problems101_200

import concepts.TreeNode
import kotlin.math.max

enum class MaximumDepthOfBinaryTree {
    DEFAULT {
        override fun maxDepth(root: TreeNode?): Int = recursiveMaxDepth(root, 0)

        fun recursiveMaxDepth(node: TreeNode?, depth: Int): Int {
            if (node == null) {
                return depth
            }
            val leftDepth = recursiveMaxDepth(node.left, depth + 1)
            val rightDepth = recursiveMaxDepth(node.right, depth + 1)
            return max(leftDepth, rightDepth)
        }
    },
    ;

    abstract fun maxDepth(root: TreeNode?): Int
}
