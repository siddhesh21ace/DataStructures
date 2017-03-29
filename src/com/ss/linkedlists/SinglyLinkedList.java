package com.ss.linkedlists;

import com.ss.common.Node;

/**
 * Created by Siddhesh on 2/7/2017.
 */
public class SinglyLinkedList<E> {
    private Node<E> head;
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
            return head.getElement();
        return null;
    }

    public E last() {
        if (!isEmpty())
            return tail.getElement();
        return null;
    }

    public void addFirst(E e) {
        head = new Node<>(e, head);
        if (isEmpty()) {
            tail = head;
        }
        size++;
    }

    public void addLast(E e) {
        Node<E> newest = new Node<>(e, null);
        if (isEmpty()) {
            head = newest;
        } else {
            tail.setNext(newest);
        }
        tail = newest;
        size++;
    }

    public E removeFirst() {
        if(isEmpty())
            return null;
        E e = head.getElement();
        head = head.getNext();
        size--;
        if(isEmpty())
            tail = null;
        return e;
    }

    /* Auxillary Methods */
    public int printKthToLast(int k) {
        return printKthToLast(head, k);
    }

    private int printKthToLast(Node node, int k) {
        if(node == null)
            return 0;
        int index = printKthToLast(node.getNext(), k) + 1;
        if(index == k) {
            System.out.println("k th to last element is : " + node.getElement());
        }
        return index;
    }

}