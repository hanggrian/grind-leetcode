package problems201_300;

import concepts.TreeNode;

enum LowestCommonAncestorOfABinarySearchTree {
    DEFAULT {
        @Override
        TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (p == null || q == null) {
                return null;
            }
            TreeNode current = root;
            while (current != null) {
                if (current.val > p.val && current.val > q.val) {
                    current = current.left;
                } else if (current.val < p.val && current.val < q.val) {
                    current = current.right;
                } else {
                    break;
                }
            }
            return current;
        }
    };

    abstract TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q);
}
