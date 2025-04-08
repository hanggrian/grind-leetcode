package problems201_300

import concepts.TreeNode

enum class LowestCommonAncestorOfABinarySearchTree {
    DEFAULT {
        override fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
            if (p == null || q == null) {
                return null
            }
            var current = root
            while (current != null) {
                current =
                    if (current.`val` > p.`val` && current.`val` > q.`val`) {
                        current.left
                    } else if (current.`val` < p.`val` && current.`val` < q.`val`) {
                        current.right
                    } else {
                        break
                    }
            }
            return current
        }
    },
    ;

    abstract fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode?
}
