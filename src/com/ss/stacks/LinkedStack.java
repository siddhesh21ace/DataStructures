package com.ss.stacks;

import com.ss.linkedlists.SinglyLinkedList;

/**
 * Created by Siddhesh on 3/12/2017.
 */
public class LinkedStack<E> implements Stack {
    private SinglyLinkedList<E> sll = new SinglyLinkedList();

    public LinkedStack() {

    }

    @Override
    public int size() {
        return sll.getSize();
    }

    @Override
    public boolean isEmpty() {
        return sll.isEmpty();
    }

    @Override
    public E top() {
        return sll.first();
    }

    @Override
    public E pop() {
        return sll.removeFirst();
    }

    @Override
    public void push(Object o) {
        sll.addFirst((E) o);
    }

}
