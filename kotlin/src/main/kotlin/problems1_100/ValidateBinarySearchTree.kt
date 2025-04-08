package problems1_100

import concepts.TreeNode

enum class ValidateBinarySearchTree {
    DEFAULT {
        override fun isValidBst(root: TreeNode?): Boolean = recursiveValid(root, null, null)

        fun recursiveValid(node: TreeNode?, left: Int?, right: Int?): Boolean {
            if (node == null) {
                return true
            }
            if (left != null && node.`val` <= left) {
                return false
            }
            if (right != null && node.`val` >= right) {
                return false
            }
            return recursiveValid(node.left, left, node.`val`) &&
                recursiveValid(node.right, node.`val`, right)
        }
    },
    ;

    abstract fun isValidBst(root: TreeNode?): Boolean
}
