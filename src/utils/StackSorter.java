package utils;

import java.util.Stack;

public class StackSorter {

    public void sort(Stack<Integer> stack) {
        Stack<Integer> auxStack = new Stack<>();

        while (!stack.isEmpty()) {
            int temp = stack.pop();

            while (!auxStack.isEmpty() && auxStack.peek() > temp) {
                stack.push(auxStack.pop());
            }

            auxStack.push(temp);
        }

        while (!auxStack.isEmpty()) {
            stack.push(auxStack.pop());
        }
    }
}