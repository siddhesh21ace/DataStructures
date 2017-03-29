package com.ss.stacks;

/**
 * Created by Siddhesh on 3/12/2017.
 */
public interface Stack<E> {
    public int size();
    public boolean isEmpty();
    public E top();
    public E pop();
    public void push(E e);
}
