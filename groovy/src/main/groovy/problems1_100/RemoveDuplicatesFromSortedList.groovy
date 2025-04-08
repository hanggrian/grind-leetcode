package problems1_100

import concepts.SinglyListNode

enum RemoveDuplicatesFromSortedList {
    DEFAULT{
        @Override
        SinglyListNode deleteDuplicates(SinglyListNode head) {
            var current = head
            while (current && current.next) {
                if (current.val == current.next.val) {
                    current.next = current.next.next
                } else {
                    current = current.next
                }
            }
            return head
        }
    }

    abstract SinglyListNode deleteDuplicates(SinglyListNode head)
}
