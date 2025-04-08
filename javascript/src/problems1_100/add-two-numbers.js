import SinglyListNode from '../concepts/singly-list-node';

class Problem {
  addTwoNumbers(l1, l2) {
    throw new Error(`Not implemented (${l1}, ${l2}).`);
  }
}

class Default extends Problem {
  addTwoNumbers(l1, l2) {
    const root = new SinglyListNode();
    let node = root;
    let carry = 0;
    while (l1 || l2) {
      // calculate total and carry
      let value = carry;
      if (l1) {
        value += l1.val;
        l1 = l1.next;
      }
      if (l2) {
        value += l2.val;
        l2 = l2.next;
      }
      carry = Math.floor(value / 10);

      // create list
      node.next = new SinglyListNode(value % 10);
      node = node.next;
    }

    // create remaining carry
    if (carry > 0) {
      node.next = new SinglyListNode(carry);
    }
    return root.next;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
