package com.ss.common;

/**
 * Created by Siddhesh on 2/7/2017.
 */
public class Node<E> {
    private E element;
    private Node<E> next;

    public Node() {

    }

    public Node(E element, Node<E> next) {
        this.setElement(element);
        this.setNext(next);
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}
