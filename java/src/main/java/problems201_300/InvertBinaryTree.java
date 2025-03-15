package problems201_300;

import concepts.TreeNode;

enum InvertBinaryTree {
    DEFAULT {
        @Override
        TreeNode invertTree(TreeNode root) {
            if (root == null) {
                return null;
            }
            TreeNode temp = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(temp);
            return root;
        }
    };

    abstract TreeNode invertTree(TreeNode root);
}
