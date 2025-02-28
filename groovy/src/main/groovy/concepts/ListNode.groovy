package concepts

import java.util.stream.Stream
import java.util.stream.StreamSupport

class ListNode<T extends ListNode<T>> implements Iterable<T> {
    int value
    T next

    ListNode(int value) {
        this.value = value
    }

    final boolean hasNext() {
        return next != null
    }

    Stream<T> stream() {
        return StreamSupport.stream(spliterator(), false)
    }

    @Override
    Iterator<T> iterator() {
        return new ListNodeIterator((T) this)
    }

    @Override
    boolean equals(Object o) {
        if (!(o instanceof ListNode)) {
            return false
        }
        ListNode<T> node1 = this
        ListNode<T> node2 = (ListNode<T>) o
        while (node1 != null && node2 != null) {
            if (node1.value != node2.value) {
                return false
            }
            node1 = node1.next
            node2 = node2.next
        }
        return node1 == null && node2 == null
    }

    @Override
    int hashCode() {
        return Objects.hashCode(value)
    }

    private class ListNodeIterator implements Iterator<T> {
        private T current

        ListNodeIterator(T node) {
            current = node
        }

        @Override
        boolean hasNext() {
            return current != null
        }

        @Override
        T next() {
            final T temp = current
            current = current.next
            return temp
        }
    }
}
