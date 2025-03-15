package problems101_200

import concepts.TreeNode

enum SymmetricTree {
    DEFAULT{
        @Override
        boolean isSymmetric(TreeNode root) {
            return root == null ||
                recursiveIsSymmetric(root.left, root.right)
        }

        boolean recursiveIsSymmetric(TreeNode node1, TreeNode node2) {
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
    }

    abstract boolean isSymmetric(TreeNode root)
}
