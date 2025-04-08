export default class ImplementQueueUsingStacks {
  pushStack: number[];
  popStack: number[];

  constructor() {
    this.pushStack = [];
    this.popStack = [];
  }

  push(x: number) {
    this.pushStack.push(x);
  }

  pop() {
    this._fillPopStack();
    return this.popStack.pop();
  }

  peek() {
    this._fillPopStack();
    return this.popStack[this.popStack.length - 1];
  }

  empty() {
    return this.pushStack.length === 0 && this.popStack.length === 0;
  }

  _fillPopStack() {
    if (this.popStack.length !== 0) {
      return;
    }
    while (this.pushStack.length !== 0) {
      this.popStack.push(this.pushStack.pop());
    }
  }
}
