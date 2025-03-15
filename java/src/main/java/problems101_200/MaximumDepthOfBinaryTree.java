package problems101_200;

import concepts.TreeNode;

enum MaximumDepthOfBinaryTree {
    DEFAULT {
        @Override
        int maxDepth(TreeNode root) {
            return recursiveMaxDepth(root, 0);
        }

        int recursiveMaxDepth(TreeNode node, int depth) {
            if (node == null) {
                return depth;
            }
            int leftDepth = recursiveMaxDepth(node.left, depth + 1);
            int rightDepth = recursiveMaxDepth(node.right, depth + 1);
            return Math.max(leftDepth, rightDepth);
        }
    };

    abstract int maxDepth(TreeNode root);
}
