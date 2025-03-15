import Stack from '../util/stack';

export default class MinStack {
  main: Stack = new Stack();
  mins: Stack = new Stack();

  push(value: number) {
    this.main.push(value);
    if (value <= this.getMinimum()) {
      this.mins.push(value);
    }
  }

  getMinimum(): number {
    return this.mins.isEmpty()
        ? Number.MAX_SAFE_INTEGER
        : this.mins.peek();
  }

  pop() {
    const value = this.main.pop();
    if (value === this.getMinimum()) {
      this.mins.pop();
    }
  }

  top(): number  {
    return this.main.peek();
  }
}
