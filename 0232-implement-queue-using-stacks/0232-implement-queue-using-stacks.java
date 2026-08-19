import java.util.Stack;

class MyQueue {
     Stack<Integer> s1;
     Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    // Push element x to the back of queue (Costly Push - O(N))
    public void push(int x) {
        // Move all elements from s1 to s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        // Push item into s1
        s1.push(x);

        // Move everything back to s1
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    // Removes the element from the front of the queue and returns it - O(1)
    public int pop() {
        return s1.pop();
    }

    // Get the front element - O(1)
    public int peek() {
        return s1.peek();
    }

    // Returns whether the queue is empty - O(1)
    public boolean empty() {
        return s1.isEmpty();
    }

    
}