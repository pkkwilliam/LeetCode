/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

 push(x) -- Push element x onto stack.
 pop() -- Removes the element on top of the stack.
 top() -- Get the top element.
 getMin() -- Retrieve the minimum element in the stack.
 Example:
 MinStack minStack = new MinStack();
 minStack.push(-2);
 minStack.push(0);
 minStack.push(-3);
 minStack.getMin();   --> Returns -3.
 minStack.pop();
 minStack.top();      --> Returns 0.
 minStack.getMin();   --> Returns -2.
 */

package problem155;

import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class MinStack {
    Stack<Integer> stack;
    TreeMap<Integer,Integer> map = new TreeMap<>();
    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        map.putIfAbsent(x, 1);
        map.computeIfPresent(x, (k, v) -> v + 1);
        stack.push(x);
    }

    public void pop() {
        pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return map.firstKey();
    }
    public static void main(String[]args){

    }
}

