import java.util.Iterator;

public final class ListNodeIterator<T extends ListNode<T>> implements Iterator<T> {
  private T current;

  ListNodeIterator(T node) {
    current = node;
  }

  @Override
  public boolean hasNext() {
    return current != null;
  }

  @Override
  public T next() {
    final var temp = current;
    current = current.getNext();
    return temp;
  }
}
