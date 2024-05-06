package task4integerstack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class IntegerStack {
    // Use an ArrayList to implement the stack
    private ArrayList<Integer> stack;

    // Constructor to initialize the stack
    public IntegerStack() {
        stack = new ArrayList<>();
    }

    // Method to push an element onto the stack
    public void push(int value) {
        stack.add(value);
        System.out.println("Pushed " + value + " onto the stack.");
    }

    // Method to pop an element from the stack
    public int pop() {
        // Check if the stack is empty
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        // Remove and return the last element in the stack
        int value = stack.remove(stack.size() - 1);
        System.out.println("Popped " + value + " from the stack.");
        return value;
    }

    // Main method to demonstrate the functionality of the stack
    public static void main(String[] args) {
        // Create an instance of IntegerStack
        IntegerStack integerStack = new IntegerStack();
        
        // Demonstrate pushing elements onto the stack
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);
        
        // Demonstrate popping elements from the stack
        integerStack.pop();
        integerStack.pop();
        integerStack.pop();
        
        // Demonstrate popping from an empty stack to trigger an exception
        try {
            integerStack.pop();  // This will throw an EmptyStackException
        } catch (EmptyStackException e) {
            System.out.println("Exception caught: Cannot pop from an empty stack.");
        }
    }
}

