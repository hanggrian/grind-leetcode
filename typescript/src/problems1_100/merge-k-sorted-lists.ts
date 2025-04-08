import SinglyListNode from '../concepts/singly-list-node';

class Problem {
  mergeKLists(lists: SinglyListNode[]): SinglyListNode | undefined {
    throw new Error(`Not implemented (${lists}).`);
  }
}

class Default extends Problem {
  mergeKLists(lists: SinglyListNode[]): SinglyListNode | undefined {
    const nodes: SinglyListNode[] = lists.filter(n => n);
    if (nodes.length === 0) {
      return undefined;
    }

    const root: SinglyListNode = new SinglyListNode();
    let current: SinglyListNode = root;
    while (nodes.length > 0) {
      // find lowest
      const lowest: SinglyListNode =
          nodes.reduce((previous, current) => current.val < previous.val ? current : previous);

      // append lowest to current
      current.next = new SinglyListNode(lowest.val);
      current = current.next;

      // remove the lowest node within list
      if (!lowest.next) {
        nodes.splice(nodes.indexOf(lowest), 1);
        continue;
      }
      const nxt: SinglyListNode = lowest.next;
      lowest.val = nxt.val;
      lowest.next = nxt.next;
    }
    return root.next;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
