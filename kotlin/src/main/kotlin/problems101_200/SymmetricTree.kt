package problems101_200

import concepts.TreeNode

enum class SymmetricTree {
    DEFAULT {
        override fun isSymmetric(root: TreeNode?): Boolean =
            root == null ||
                recursiveIsSymmetric(root.left, root.right)

        fun recursiveIsSymmetric(node1: TreeNode?, node2: TreeNode?): Boolean {
            if (node1 == null && node2 == null) {
                return true
            }
            if (node1 == null || node2 == null) {
                return false
            }
            return node1.value == node2.value &&
                recursiveIsSymmetric(node1.left, node2.right) &&
                recursiveIsSymmetric(node1.right, node2.left)
        }
    },
    ;

    abstract fun isSymmetric(root: TreeNode?): Boolean
}
