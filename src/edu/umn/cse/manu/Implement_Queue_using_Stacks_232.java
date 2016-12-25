package edu.umn.cse.manu;

/**
 * Created by maste on 12/24/2016.
 */
public class Implement_Queue_using_Stacks_232 {

    // Push element x to the back of queue.
    int[] queue = new int[1000];
    int count = 0;
    int start = -1;
    int end = -1;
    int len = queue.length;

    public void push(int x) {
        if (count == len) {
            //No space to enter
        }
        end = (end + 1) % len;
        queue[end] = x;
        count++;
        if (count == 1) {
            start = end;
        }
    }

    // Removes the element from in front of queue.
    public void pop() {
        if (count == 0) {
            //No element in the queue
        }

        start = (start + 1) % len;
        count--;
    }

    // Get the front element.
    public int peek() {
        if (count != 0) {
            return queue[start];
        } else {
            return 1;
        }
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return (count == 0);
    }
}
