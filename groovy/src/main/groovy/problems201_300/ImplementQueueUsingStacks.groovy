package problems201_300

class ImplementQueueUsingStacks {
    private final Stack<Integer> pushStack = []
    private final Stack<Integer> popStack = []

    void push(int x) {
        pushStack.push(x)
    }

    int pop() {
        fillPopStack()
        return popStack.pop()
    }

    int peek() {
        fillPopStack()
        return popStack.peek()
    }

    boolean empty() {
        return pushStack.isEmpty() && popStack.isEmpty()
    }

    private void fillPopStack() {
        if (!popStack.isEmpty()) {
            return
        }
        while (!pushStack.isEmpty()) {
            popStack.push(pushStack.pop())
        }
    }
}
