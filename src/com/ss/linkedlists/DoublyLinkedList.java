package com.ss.linkedlists;

import com.ss.common.DLNode;
import com.ss.common.Node;

/**
 * Created by Siddhesh on 3/12/2017.
 */
public class DoublyLinkedList<E> {
    private Node<E> header;
    private Node<E> trailer;
    private int size;

    public DoublyLinkedList() {
        header = new DLNode<>(null, null, null);
        trailer = new DLNode<>(null, header, null);
        header.setNext(trailer);
    }

    private boolean isEmpty() {
        return getSize() == 0;
    }

    public int getSize() {
        return size;
    }

    public E first() {
        if (!isEmpty())
            return header.getNext().getElement();
        return null;
    }

    public E last() {
        if (!isEmpty())
            return (E) ((DLNode) trailer).getPrev().getElement();
        return null;
    }

    private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
        Node<E> newest = new DLNode<E>(e, predecessor, successor);
        predecessor.setNext(newest);
        ((DLNode) successor).setPrev(newest);
        size++;
    }

    private E remove(Node<E> node) {
        Node<E> predecessor = ((DLNode) node).getPrev();
        Node<E> successor = node.getNext();
        predecessor.setNext(successor);
        ((DLNode) successor).setPrev(predecessor);
        size--;
        return node.getElement();
    }

    public void addFirst(E e) {
        addBetween(e, header, header.getNext());
    }

    public void addLast(E e) {
        addBetween(e, ((DLNode) trailer).getPrev(), trailer);
    }

    public E removeFirst() {
        if (isEmpty())
            return null;
        return remove(header.getNext());
    }

    public E removeLast() {
        if (isEmpty())
            return null;
        return (E) remove(((DLNode) trailer).getPrev());
    }

}
