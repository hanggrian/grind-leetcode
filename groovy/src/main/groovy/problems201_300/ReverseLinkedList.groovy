package problems201_300

import concepts.SinglyListNode

enum ReverseLinkedList {
    DEFAULT{
        @Override
        SinglyListNode reverseList(SinglyListNode head) {
            var previous = null
            var current = head
            while (current) {
                var next = current.next
                current.next = previous
                previous = current
                current = next
            }
            return previous
        }
    }

    abstract SinglyListNode reverseList(SinglyListNode head)
}
