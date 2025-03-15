package problems101_200

import concepts.TreeNode

enum class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    DEFAULT {
        override fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
            if (preorder.isEmpty() || inorder.isEmpty()) {
                return null
            }
            val root = TreeNode(preorder[0])
            var mid = -1
            for (i in inorder.indices) {
                if (inorder[i] != preorder[0]) {
                    continue
                }
                mid = i
                break
            }
            root.left =
                buildTree(
                    preorder.copyOfRange(1, mid + 1),
                    inorder.copyOfRange(0, mid),
                )
            root.right =
                buildTree(
                    preorder.copyOfRange(mid + 1, preorder.size),
                    inorder.copyOfRange(mid + 1, inorder.size),
                )
            return root
        }
    },
    ;

    abstract fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode?
}
