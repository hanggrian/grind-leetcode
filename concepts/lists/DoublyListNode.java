import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public final class DoublyListNode extends ListNode<DoublyListNode>
    implements Iterable<DoublyListNode> {
  private final int value;
  private DoublyListNode prev;
  private DoublyListNode next;

  public DoublyListNode() {
    value = 0;
  }

  public DoublyListNode(int value) {
    this.value = value;
  }

  @Override
  public int getValue() {
    return value;
  }

  public DoublyListNode getPrevious() {
    return prev;
  }

  public void setPrevious(DoublyListNode node) {
    prev = node;
  }

  @Override
  public DoublyListNode getNext() {
    return next;
  }

  @Override
  public void setNext(DoublyListNode node) {
    next = node;
  }

  @Override
  public Iterator<DoublyListNode> iterator() {
    return new ListNodeIterator<>(this);
  }

  public Stream<DoublyListNode> stream() {
    return StreamSupport.stream(spliterator(), false);
  }

  public static DoublyListNode asDoubly(int... values) {
    if (values.length == 0) {
      throw new IllegalArgumentException("Can't be empty.");
    }
    final var head = new DoublyListNode(values[0]);
    DoublyListNode prev = null;
    var next = head;
    for (var i = 1; i < values.length; i++) {
      final var temp = next;

      next.setPrevious(prev);
      next.setNext(new DoublyListNode(values[i]));
      next = next.getNext();

      prev = temp;
    }
    return head;
  }
}
