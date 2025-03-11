package problems1_100;

import concepts.SinglyListNode;

enum ReverseLinkedList2 {
    DEFAULT {
        @Override
        SinglyListNode reverseBetween(SinglyListNode head, int left, int right) {
            if (left == right) {
                return head;
            }

            SinglyListNode root = new SinglyListNode(0, head);
            SinglyListNode centerStart = root;
            SinglyListNode centerStartPrevious = null;
            SinglyListNode centerEnd = root;
            for (int i = 0; i < right; i++) {
                if (i < left) {
                    centerStartPrevious = centerStart;
                    centerStart = centerStart.next;
                }
                centerEnd = centerEnd.next;
            }

            SinglyListNode excess = centerEnd.next;
            centerStartPrevious.next = null;
            centerEnd.next = null;

            SinglyListNode current;
            if (left == 1) {
                head = reverse(centerStart);
                current = head;
            } else {
                current = traverseUntilEnd(head);
                current.next = reverse(centerStart);
            }
            current = traverseUntilEnd(current);
            current.next = excess;
            return head;
        }

        SinglyListNode traverseUntilEnd(SinglyListNode node) {
            SinglyListNode current = node;
            while (current.next != null) {
                current = current.next;
            }
            return current;
        }

        SinglyListNode reverse(SinglyListNode node) {
            SinglyListNode current = node;
            SinglyListNode previous = null;
            while (current != null) {
                SinglyListNode temp = current.next;
                current.next = previous;
                previous = current;
                current = temp;
            }
            return previous;
        }
    };

    abstract SinglyListNode reverseBetween(SinglyListNode head, int left, int right);
}
