package problems201_300

import concepts.SinglyListNode

enum PalindromeLinkedList {
    DEFAULT{
        @Override
        boolean isPalindrome(SinglyListNode head) {
            var slow = head
            var fast = head
            while (fast && fast.next) {
                slow = slow.next
                fast = fast.next.next
            }

            var right = reverse(slow)
            slow.next = null // sever
            var left = head

            while (left && right) {
                if (left.val != right.val) {
                    return false
                }
                left = left.next
                right = right.next
            }
            return true
        }

        SinglyListNode reverse(SinglyListNode node) {
            var previous = null
            var current = node
            while (current) {
                var next = current.next
                current.next = previous
                previous = current
                current = next
            }
            return previous
        }
    }

    abstract boolean isPalindrome(SinglyListNode head)
}
