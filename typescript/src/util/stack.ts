export default class Stack {
  items: number[] = [];

  push(element: number) {
    this.items.push(element);
  }

  pop(): number {
    if (this.isEmpty()) {
      return undefined;
    }
    return this.items.pop();
  }

  peek(): number {
    if (this.isEmpty()) {
      return undefined;
    }
    return this.items[this.items.length - 1];
  }

  isEmpty(): boolean {
    return this.items.length === 0;
  }

  size(): number {
    return this.items.length;
  }
}
