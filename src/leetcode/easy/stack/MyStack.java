package leetcode.easy.stack;

// Topic: Stack, Queue, LinkedList

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    private Queue<Integer> queue = new LinkedList<>();

    public void push(int x) {
        queue.add(x);
        for (int i = 0; i < queue.size(); i++) {
            queue.add(queue.remove());
        }
    }

    public Integer pop() {
        return queue.remove();
    }

    public int top() {
        return queue.size() > 1 ? queue.peek() : -1;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
