package problems1_100

import concepts.TreeNode

enum ValidateBinarySearchTree {
    DEFAULT{
        @Override
        boolean isValidBst(TreeNode root) {
            return recursiveValid(root, null, null)
        }

        boolean recursiveValid(TreeNode node, Integer left, Integer right) {
            if (!node) {
                return true
            }
            if (left && node.val <= left) {
                return false
            }
            if (right && node.val >= right) {
                return false
            }
            return recursiveValid(node.left, left, node.val) &&
                recursiveValid(node.right, node.val, right)
        }
    }

    abstract boolean isValidBst(TreeNode root)
}
