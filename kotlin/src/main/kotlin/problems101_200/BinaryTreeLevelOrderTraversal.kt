package problems101_200

import concepts.TreeNode
import java.util.LinkedList

enum class BinaryTreeLevelOrderTraversal {
    DEFAULT {
        override fun levelOrder(root: TreeNode?): List<List<Int>> {
            val lists = arrayListOf<List<Int>>()
            if (root == null) {
                return lists
            }

            val queue = LinkedList<TreeNode?>()
            queue += root
            while (!queue.isEmpty()) {
                val size = queue.size
                val level = arrayListOf<Int>()
                for (i in 0 until size) {
                    val current = queue.remove()
                    level += current!!.`val`
                    if (current!!.left != null) {
                        queue += current.left
                    }
                    if (current.right != null) {
                        queue += current.right
                    }
                }
                lists += level
            }
            return lists
        }
    },
    ;

    abstract fun levelOrder(root: TreeNode?): List<List<Int>>
}
