import SinglyListNode from '../concepts/singly-list-node';

class Problem {
  removeElements(head: SinglyListNode | undefined, val: number): SinglyListNode | undefined {
    throw new Error(`Not implemented (${head}, ${val}).`);
  }
}

class Default extends Problem {
  removeElements(head: SinglyListNode | undefined, val: number): SinglyListNode | undefined {
    const newHead: SinglyListNode = new SinglyListNode();
    let currentNew: SinglyListNode = newHead;

    let current: SinglyListNode | undefined = head;
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
