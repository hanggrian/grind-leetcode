package problems201_300;

import concepts.SinglyListNode;

enum PalindromeLinkedList {
    DEFAULT {
        @Override
        boolean isPalindrome(SinglyListNode head) {
            SinglyListNode slow = head;
            SinglyListNode fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            SinglyListNode right = reverse(slow);
            slow.next = null; // sever
            SinglyListNode left = head;

            while (left != null && right != null) {
                if (left.val != right.val) {
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
        }

        SinglyListNode reverse(SinglyListNode node) {
            SinglyListNode previous = null;
            SinglyListNode current = node;
            while (current != null) {
                SinglyListNode next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }
            return previous;
        }
    };

    abstract boolean isPalindrome(SinglyListNode head);
}
