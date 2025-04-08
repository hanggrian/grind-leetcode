package problems101_200

import concepts.TreeNode

enum SymmetricTree {
    DEFAULT{
        @Override
        boolean isSymmetric(TreeNode root) {
            return !root ||
                recursiveIsSymmetric(root.left, root.right)
        }

        boolean recursiveIsSymmetric(TreeNode node1, TreeNode node2) {
            if (!node1  && !node2) {
                return true
            }
            if (!node1 || !node2) {
                return false
            }
            return node1.val == node2.val &&
                recursiveIsSymmetric(node1.left, node2.right) &&
                recursiveIsSymmetric(node1.right, node2.left)
        }
    }

    abstract boolean isSymmetric(TreeNode root)
}
