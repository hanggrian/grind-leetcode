package problems1_100

import concepts.TreeNode

enum ValidateBinarySearchTree {
    DEFAULT{
        @Override
        boolean isValidBst(TreeNode root) {
            return recursiveValid(root, null, null)
        }

        boolean recursiveValid(TreeNode node, Integer left, Integer right) {
            if (node == null) {
                return true
            }
            if (left != null && node.value <= left) {
                return false
            }
            if (right != null && node.value >= right) {
                return false
            }
            return recursiveValid(node.left, left, node.value) &&
                recursiveValid(node.right, node.value, right)
        }
    }

    abstract boolean isValidBst(TreeNode root)
}
