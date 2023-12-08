package com.dsa;

public class Stack {
    private int[] array;
    private int top;

    public Stack(int capacity) {
        array = new int[capacity];
        top = -1;
    }

    public void push(int element) {
        if (top == array.length - 1) {
            return;
        }
        top++;
        array[top] = element;
    }

    public int pop() {
        if (top == -1) {
            return -1;
        }
        int poppedElement = array[top];
        top--;
        return poppedElement;
    }

    public int peek() {
        if (top == -1) {
            return -1;
        }
        return array[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == array.length - 1);
    }
}
