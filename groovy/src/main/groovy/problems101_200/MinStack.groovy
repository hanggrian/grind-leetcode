package problems101_200

class MinStack {
    Stack<Integer> main = []
    Stack<Integer> mins = []

    void push(int value) {
        main.push(value)
        if (value <= getMinimum()) {
            mins.push(value)
        }
    }

    int getMinimum() {
        return mins.isEmpty()
            ? Integer.MAX_VALUE
            : mins.peek()
    }

    void pop() {
        var value = main.pop()
        if (value == getMinimum()) {
            mins.pop()
        }
    }

    int top() {
        return main.peek()
    }
}
