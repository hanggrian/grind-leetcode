package problems201_300

import concepts.TreeNode

enum class InvertBinaryTree {
    DEFAULT {
        override fun invertTree(root: TreeNode?): TreeNode? {
            if (root == null) {
                return null
            }
            val temp = root.left
            root.left = invertTree(root.right)
            root.right = invertTree(temp)
            return root
        }
    },
    ;

    abstract fun invertTree(root: TreeNode?): TreeNode?
}
