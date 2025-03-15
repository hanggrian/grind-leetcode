import SinglyListNode from '../concepts/singly-list-node';

class Problem {
  reverseBetween(
      head: SinglyListNode | undefined,
      left: number,
      right: number,
  ): SinglyListNode | undefined {
    throw new Error(`Not implemented (${head}, ${left}, ${right}).`);
  }
}

class Default extends Problem {
  reverseBetween(
      head: SinglyListNode | undefined,
      left: number,
      right: number,
  ): SinglyListNode | undefined {
    if (left === right) {
      return head;
    }

    const root = new SinglyListNode(0, head);
    let centerStart = root;
    let centerStartPrevious = undefined;
    let centerEnd = root;
    for (let i = 0; i < right; i++) {
      if (i < left) {
        centerStartPrevious = centerStart;
        centerStart = centerStart.next;
      }
      centerEnd = centerEnd.next;
    }

    const excess = centerEnd.next;
    centerStartPrevious.next = undefined;
    centerEnd.next = undefined;

    let current: SinglyListNode;
    if (left === 1) {
      head = this.reverse(centerStart);
      current = head;
    } else {
      current = this.traverseUntilEnd(head);
      current.next = this.reverse(centerStart);
    }
    current = this.traverseUntilEnd(current);
    current.next = excess;
    return head;
  }

  traverseUntilEnd(node: SinglyListNode) {
    let current = node;
    while (current.next) {
      current = current.next;
    }
    return current;
  }

  reverse(node: SinglyListNode) {
    let current = node;
    let previous = undefined;
    while (current) {
      const temp = current.next;
      current.next = previous;
      previous = current;
      current = temp;
    }
    return previous;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
