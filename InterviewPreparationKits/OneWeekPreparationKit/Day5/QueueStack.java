package InterviewPreparationKits.OneWeekPreparationKit.Day5;

import java.util.Stack;

public class QueueStack<T> {
    Stack<T> queueNewestOnTop = new Stack<T>();
    Stack<T> queueOldestOnTop = new Stack<T>();

    public void enqueue(T value) {
        queueNewestOnTop.push(value);
    }

    public T peek() {
        shiftStacks();
        return queueOldestOnTop.peek();
    }

    public T dequeue() {
        shiftStacks();
        return queueOldestOnTop.pop();
    }

    /*
     * Function that shifts all the elements that has been added to the newestOnTop
     * stack to the oldestOnTop stack. Doing this, we can shift all the elements
     * added en having it in the right order (FIFO).
     */
    private void shiftStacks() {
        if (queueOldestOnTop.isEmpty()) {
            while (!queueNewestOnTop.isEmpty()) {
                queueOldestOnTop.push(queueNewestOnTop.pop());
            }
        }
    }
}
