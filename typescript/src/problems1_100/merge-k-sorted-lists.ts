import {SinglyListNode} from '../concepts/list-nodes';

class Problem {
  mergeKLists(lists: SinglyListNode[]): SinglyListNode {
    throw new Error(`Not implemented (${lists}).`);
  }
}

class Default extends Problem {
  mergeKLists(lists: SinglyListNode[]): SinglyListNode {
    const nodes = lists.filter(n => n);
    if (nodes.length === 0) {
      return undefined;
    }

    const root = new SinglyListNode();
    let current = root;
    while (nodes.length > 0) {
      // find lowest
      const lowest =
          nodes.reduce((previous, current) => current.value < previous.value ? current : previous);

      // append lowest to current
      current.next = new SinglyListNode(lowest.value);
      current = current.next;

      // remove the lowest node within list
      if (!lowest.next) {
        nodes.splice(nodes.indexOf(lowest), 1);
        continue;
      }
      const nxt = lowest.next;
      lowest.value = nxt.value;
      lowest.next = nxt.next;
    }
    return root.next;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
