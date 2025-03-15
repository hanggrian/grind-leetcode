package problems101_200

import concepts.TreeNode

enum ConstructBinaryTreeFromPreorderAndInorderTraversal {
    DEFAULT {
        @Override
        TreeNode buildTree(int[] preorder, int[] inorder) {
            if (preorder.length == 0 || inorder.length == 0) {
                return null
            }
            var root = new TreeNode(preorder[0])
            var mid = -1
            for (var i = 0; i < inorder.length; i++) {
                if (inorder[i] != preorder[0]) {
                    continue
                }
                mid = i
                break
            }
            root.left =
                buildTree(
                    Arrays.copyOfRange(preorder, 1, mid + 1),
                    Arrays.copyOfRange(inorder, 0, mid),
                )
            root.right =
                buildTree(
                    Arrays.copyOfRange(preorder, mid + 1, preorder.length),
                    Arrays.copyOfRange(inorder, mid + 1, inorder.length),
                )
            return root
        }
    }

    abstract TreeNode buildTree(int[] preorder, int[] inorder)
}
