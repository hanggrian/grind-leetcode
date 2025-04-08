import SinglyListNode from '../concepts/singly-list-node';

class Problem {
  rotateRight(head: SinglyListNode | undefined, k: number): SinglyListNode | undefined {
    throw new Error(`Not implemented (${head}, ${k}).`);
  }
}

class Default extends Problem {
  rotateRight(head: SinglyListNode | undefined, k: number): SinglyListNode | undefined {
    if (!head || k === 0) {
      return head;
    }
    const root: SinglyListNode = new SinglyListNode(0, head);

    // move left pointer, resetting if reached end
    let left: SinglyListNode = root;
    for (let i = 0; i < k; i++) {
      left = left.next;
      if (!left) {
        left = root.next;
      }
    }

    // get n-th from last, keeping previous node
    let right: SinglyListNode | undefined = root;
    let previousRight: SinglyListNode | undefined;
    while (left) {
      left = left.next;
      let nextRight = right.next;
      previousRight = right;
      right = nextRight;
    }

    // sever middle, set last of right to start of left
    previousRight.next = undefined;
    let lastRight: SinglyListNode = right;
    while (lastRight.next) {
      lastRight = lastRight.next;
    }
    lastRight.next = root.next;

    return right;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
