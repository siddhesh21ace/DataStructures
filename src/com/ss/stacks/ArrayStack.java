package com.ss.stacks;

/**
 * Created by Siddhesh on 3/12/2017.
 */
public class ArrayStack<E> implements Stack<E> {
    public static final int CAPACITY = 1000;
    private E[] data;
    private int top = -1;

    public ArrayStack() {
        this(CAPACITY);
    }

    public ArrayStack(int capacity) {
        data = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
    public E top() {
        if (isEmpty())
            return null;
        return data[top];
    }

    @Override
    public E pop() {
        if (isEmpty())
            return null;
        E ele = data[top];
        data[top--] = null;
        return ele;
    }

    @Override
    public void push(E e) {
        try {
            if (size() == CAPACITY)
                throw new Exception("Array is full");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        data[++top] = e;
    }
}
