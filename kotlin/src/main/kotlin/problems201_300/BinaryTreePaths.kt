package problems201_300

import concepts.TreeNode

enum class BinaryTreePaths {
    DEFAULT {
        override fun binaryTreePaths(root: TreeNode?): List<String> {
            val paths: MutableList<String> = ArrayList()
            dfs(root, paths, "")
            return paths
        }

        fun dfs(node: TreeNode?, paths: MutableList<String>, path: String) {
            if (node == null) {
                return
            }
            if (node.left == null && node.right == null) {
                paths.add("$path${node.`val`}")
            }
            if (node.left != null) {
                dfs(node.left!!, paths, "$path${node.`val`}->")
            }
            if (node.right != null) {
                dfs(node.right!!, paths, "$path${node.`val`}->")
            }
        }
    },
    ;

    abstract fun binaryTreePaths(root: TreeNode?): List<String>
}
