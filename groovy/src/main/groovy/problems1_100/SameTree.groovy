package problems1_100

import concepts.TreeNode

enum SameTree {
    DEFAULT{
        @Override
        boolean isSameTree(TreeNode p, TreeNode q) {
            if (!p && !q) {
                return true
            }
            if (!p || !q) {
                return false
            }
            if (p.val != q.val) {
                return false
            }
            return isSameTree(p.left, q.left) &&
                isSameTree(p.right, q.right)
        }
    }

    abstract boolean isSameTree(TreeNode p, TreeNode q)
}
