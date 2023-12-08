package com.dsa;

public class Queue {
    private int values[];
    private int front, rear, capacity;

    public Queue(int capacity) {
        front = rear = 0;
        this.capacity = capacity;
        values = new int[capacity];
    }

    public void enqueue(int data)
    {
        if (capacity == rear) {
            return;
        }
        values[rear] = data;
        rear++;
    }
 
    public int dequeue()
    {
        if (front == rear) {
            return 0;
        }
 
        int value = values[0];

        for (int i = 0; i < rear - 1; i++) {
            values[i] = values[i + 1];
        }

        if (rear < capacity)
            values[rear] = 0;

        rear--;
        return value;
    }

    public boolean isEmpty() {
        return (front == rear);
    }

    public boolean isFull() {
        return (capacity == rear);
    }
}
