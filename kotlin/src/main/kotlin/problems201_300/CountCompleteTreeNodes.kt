package problems201_300

import concepts.TreeNode
import java.util.LinkedList
import java.util.Queue

enum class CountCompleteTreeNodes {
    DEFAULT {
        override fun countNodes(root: TreeNode?): Int {
            if (root == null) {
                return 0
            }
            var count = 0
            val queue: Queue<TreeNode?> = LinkedList()
            queue.add(root)
            while (!queue.isEmpty()) {
                val node = queue.remove()
                count++
                if (node!!.left != null) {
                    queue.add(node.left)
                }
                if (node.right != null) {
                    queue.add(node.right)
                }
            }
            return count
        }
    },
    ;

    abstract fun countNodes(root: TreeNode?): Int
}
