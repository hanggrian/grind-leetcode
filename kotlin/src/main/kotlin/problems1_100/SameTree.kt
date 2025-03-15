package problems1_100

import concepts.TreeNode

enum class SameTree {
    DEFAULT {
        override fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
            if (p == null && q == null) {
                return true
            }
            if (p == null || q == null) {
                return false
            }
            if (p.value != q.value) {
                return false
            }
            return isSameTree(p.left, q.left) &&
                isSameTree(p.right, q.right)
        }
    },
    ;

    abstract fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean
}
