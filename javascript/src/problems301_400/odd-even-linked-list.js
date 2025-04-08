class Problem {
  oddEvenList(head) {
    throw new Error(`Not implemented (${head}).`);
  }
}

class Default extends Problem {
  oddEvenList(head) {
    if (!head) {
      return undefined;
    }

    let odd = head;
    let even = head.next;
    const evenHead = even;

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
