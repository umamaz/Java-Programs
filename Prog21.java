import java.util.Stack;

public class Prog21 {
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> stack = new Stack<>();

        // Adding elements to the stack (PUSH)
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack after adding elements: " + stack);

        // Removing elements from the stack (POP)
        int removedElement = stack.pop();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Stack after removing an element: " + stack);

        // Checking the top element without removing (PEEK)
        int topElement = stack.peek();
        System.out.println("Top element: " + topEle);
    }
