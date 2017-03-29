package com.ss.common;

/**
 * Created by Siddhesh on 3/12/2017.
 */
public class DLNode<E> extends Node<E> {
    private Node<E> prev;

    public DLNode(E e, Node prev, Node next) {
        super(e, next);
        this.prev = prev;
    }

    public Node<E> getPrev() {
        return prev;
    }

    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }
}
