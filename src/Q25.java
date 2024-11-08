import java.util.Scanner;

class Stack {
    private int maxSize, top;
    private int[] stack;

    public Stack(int size) {
        maxSize = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) stack[++top] = value;
        else System.out.println("Stack overflow");
    }

    public int pop() {
        return (top >= 0) ? stack[top--] : -1;
    }

    public void display() {
        for (int i = top; i >= 0; i--) System.out.print(stack[i] + " ");
        System.out.println();
    }
}

class ArrayStack {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.display();
        stack.pop();
        stack.display();
    }
}
