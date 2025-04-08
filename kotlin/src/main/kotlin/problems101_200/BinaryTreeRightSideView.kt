package problems101_200

import concepts.TreeNode

enum class BinaryTreeRightSideView {
    DEFAULT {
        override fun rightSideView(root: TreeNode?): List<Int> {
            val result = arrayListOf<Int>()
            dfs(root, result, 0)
            return result
        }

        fun dfs(node: TreeNode?, list: MutableList<Int>, level: Int) {
            if (node == null) {
                return
            }
            if (level == list.size) {
                list.add(node.`val`)
            }
            dfs(node.right, list, level + 1)
            dfs(node.left, list, level + 1)
        }
    },
    ;

    abstract fun rightSideView(root: TreeNode?): List<Int>
}
