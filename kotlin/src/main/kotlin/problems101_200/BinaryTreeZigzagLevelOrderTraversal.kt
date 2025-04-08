package problems101_200

import concepts.TreeNode
import java.util.Collections
import java.util.LinkedList

enum class BinaryTreeZigzagLevelOrderTraversal {
    DEFAULT {
        override fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
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
                    val node = queue.remove()
                    level += node!!.`val`
                    if (node!!.left != null) {
                        queue += node.left
                    }
                    if (node.right != null) {
                        queue += node.right
                    }
                }
                lists += level
            }

            for (i in lists.indices) {
                if (i % 2 == 1) {
                    Collections.reverse(lists[i])
                }
            }
            return lists
        }
    },
    ;

    abstract fun zigzagLevelOrder(root: TreeNode?): List<List<Int>>
}
