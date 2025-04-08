import SinglyListNode from '../concepts/singly-list-node';

class Problem {
  removeElements(head, val) {
    throw new Error(`Not implemented (${head}, ${val}).`);
  }
}

class Default extends Problem {
  removeElements(head, val) {
    const newHead = new SinglyListNode();
    let currentNew = newHead;

    let current = head;
    while (current) {
      if (current.val !== val) {
        currentNew.next = new SinglyListNode(current.val);
        currentNew = currentNew.next;
      }
      current = current.next;
    }
    return newHead.next;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
