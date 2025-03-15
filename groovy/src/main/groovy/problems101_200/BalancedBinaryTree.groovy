package problems101_200

import concepts.TreeNode

enum BalancedBinaryTree {
    DEFAULT{
        @Override
        boolean isBalanced(TreeNode root) {
            if (root == null) {
                return true
            }
            if (Math.abs(maxDepth(root.left, 1) - maxDepth(root.right, 1)) > 1) {
                return false
            }
            return isBalanced(root.left) && isBalanced(root.right)
        }

        int maxDepth(TreeNode node, int depth) {
            if (node == null) {
                return depth
            }
            var leftDepth = maxDepth(node.left, depth + 1)
            var rightDepth = maxDepth(node.right, depth + 1)
            return Math.max(leftDepth, rightDepth)
        }
    }

    abstract boolean isBalanced(TreeNode root)
}
