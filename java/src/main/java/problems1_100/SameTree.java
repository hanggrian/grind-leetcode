package problems1_100;

import concepts.TreeNode;

enum SameTree {
    DEFAULT {
        @Override
        boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null && q == null) {
                return true;
            }
            if (p == null || q == null) {
                return false;
            }
            if (p.value != q.value) {
                return false;
            }
            return isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
        }
    };

    abstract boolean isSameTree(TreeNode p, TreeNode q);
}
