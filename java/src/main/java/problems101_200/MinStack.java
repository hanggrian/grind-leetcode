package problems101_200;

import java.util.Stack;

class MinStack {
    Stack<Integer> main = new Stack<>();
    Stack<Integer> mins = new Stack<>();

    void push(int value) {
        main.push(value);
        if (value <= getMinimum()) {
            mins.push(value);
        }
    }

    int getMinimum() {
        return mins.isEmpty()
            ? Integer.MAX_VALUE
            : mins.peek();
    }

    void pop() {
        int value = main.pop();
        if (value == getMinimum()) {
            mins.pop();
        }
    }

    int top() {
        return main.peek();
    }
}
