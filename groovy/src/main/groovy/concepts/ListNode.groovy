package concepts

import java.util.stream.Stream
import java.util.stream.StreamSupport

class ListNode<T extends ListNode<T>> extends Node implements Iterable<T> {
    T next

    ListNode(int val) {
        super(val)
    }

    Stream<T> stream() {
        return StreamSupport.stream(spliterator(), false)
    }

    @Override
    Iterator<T> iterator() {
        return new ListNodeIterator((T) this)
    }

    @Override
    boolean equals(Object other) {
        if (!(other instanceof ListNode)) {
            return false
        }
        var node1 = this
        var node2 = (ListNode<T>) other
        while (node1 && node2) {
            if (node1.val != node2.val) {
                return false
            }
            node1 = node1.next
            node2 = node2.next
        }
        return !node1 && !node2
    }

    @Override
    int hashCode() {
        return Objects.hashCode(val)
    }

    private class ListNodeIterator implements Iterator<T> {
        private T current

        ListNodeIterator(T node) {
            current = node
        }

        @Override
        boolean hasNext() {
            return current
        }

        @Override
        T next() {
            final T temp = current
            current = current.next
            return temp
        }
    }
}
