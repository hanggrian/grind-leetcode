import SinglyListNode from '../concepts/singly-list-node';

class Problem {
  oddEvenList(head: SinglyListNode | undefined): SinglyListNode | undefined {
    throw new Error(`Not implemented (${head}).`);
  }
}

class Default extends Problem {
  oddEvenList(head: SinglyListNode | undefined): SinglyListNode | undefined {
    if (!head) {
      return undefined;
    }

    let odd: SinglyListNode = head;
    let even: SinglyListNode | undefined = head.next;
    const evenHead: SinglyListNode = even;

    while (even && even.next) {
      odd.next = even.next;
      odd = odd.next;
      even.next = odd.next;
      even = even.next;
    }

    odd.next = evenHead;
    return head;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
