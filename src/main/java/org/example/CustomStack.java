package org.example;


import java.util.ArrayList;

public class CustomStack<T> {
    private final ArrayList<T> stack;
    private int top = -1;

    public CustomStack() {
        this.stack = new ArrayList<>();
    }

    public void push(T data) {
        top = top + 1;
        stack.add(data);
    }

    public T top() {
        if (empty()) {
            System.out.println("Stack Underflow");
            return null;
        } else
            return stack.get(top);
    }

    public T pop() {
        if (size() == 0) {
            System.out.println("Stack Underflow");
            return null;
        } else {
            T removed = stack.remove(top);
            top--;
            return removed;
        }

    }

    boolean empty() {
        return size() == 0;
    }

    public int size(){
        return stack.size();
    }

    public String toString() {
        if (size() == 0) return "Stack is empty";

        StringBuilder Ans = new StringBuilder();

        for (int i = 0; i < size(); i++) {
            Ans.append(stack.get(i)).append(" ");
        }

        return Ans.toString();
    }
}
