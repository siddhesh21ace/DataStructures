package com.ss.linkedlists;

import com.ss.common.Node;

/**
 * Created by Siddhesh on 2/7/2017.
 */
public class CircularLinkedList<E> {
    private Node<E> tail;

    private int size;

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public int getSize() {
        return size;
    }

    public E first() {
        if (!isEmpty())
            return tail.getNext().getElement();
        return null;
    }

    public E last() {
        if (!isEmpty())
            return tail.getElement();
        return null;
    }

    public void rotate() {
        if(tail != null)
            tail = tail.getNext();
    }

    public void addFirst(E e) {
        Node<E> newest = new Node<E>(e, null);
        if(isEmpty()) {
            tail = newest;
        } else {
            newest.setNext(tail.getNext());
        }
        tail.setNext(newest);
        size++;
    }

    public void addLast(E e) {
        addFirst(e);
        tail = tail.getNext();
    }

    public E removeFirst() {
        if(isEmpty())
            return null;
        Node<E> tobeRemoved = tail.getNext();
        if(tobeRemoved == tail) {
            tail = null;
        } else {
            tail.setNext(tobeRemoved.getNext());
        }
        size--;
        return tobeRemoved.getElement();
    }

}