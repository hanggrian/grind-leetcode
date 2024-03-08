public class Solution2 {
  public static SinglyListNode addTwoNumbers(SinglyListNode l1, SinglyListNode l2) {
    final var dummy = new SinglyListNode();
    var next1 = l1;
    var next2 = l2;
    var node = dummy;
    var carry = 0;
    while (next1 != null || next2 != null) {
      // calculate total and carry
      var val = carry;
      if (next1 != null) {
        val += next1.getValue();
        next1 = next1.getNext();
      }
      if (next2 != null) {
        val += next2.getValue();
        next2 = next2.getNext();
      }
      carry = val / 10;

      // create list
      node.setNext(new SinglyListNode(val % 10));
      node = node.getNext();
    }
    // create remaining carry
    if (carry > 0) {
      node.setNext(new SinglyListNode(carry));
    }
    return dummy.getNext();
  }
}
