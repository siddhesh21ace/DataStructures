package com.ss.linkedlists;

public class Main<E> {

    public static void main(String[] args) {
        Object first = null;
        Object last = null;

        // write your code here
        /*SinglyLinkedList sll = new SinglyLinkedList();
        sll.addFirst(25);
        sll.addFirst(50);
        sll.addLast(75);
        sll.addLast(100);

        System.out.println("Size of the linked list : " + sll.getSize());
        first = sll.removeFirst();
        System.out.println("Removed element from the linked list : " + first);
        System.out.println("Size of the linked list after removal: " + sll.getSize());
        System.out.println("First element is : " + sll.first());
        System.out.println("Last element is : " + sll.last());*/

        /*
        System.out.println("**************************Circular Linked List*********************************");

        CircularLinkedList cll = new CircularLinkedList();
        cll.addFirst(25);
        cll.addFirst(50);
        cll.addLast(75);
        cll.addLast(100);
        cll.rotate();

        System.out.println("Size of the linked list : " + cll.getSize());
        first = cll.removeFirst();
        System.out.println("Removed element from the linked list : " + first);
        System.out.println("Size of the linked list after removal: " + cll.getSize());
        System.out.println("First element is : " + cll.first());
        System.out.println("Last element is : " + cll.last());*/


        System.out.println("**************************Doubly Linked List*********************************");

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(25);
        dll.addFirst(50);
        dll.addLast(75);
        dll.addLast(100);

        System.out.println("Size of the linked list : " + dll.getSize());
        first = dll.removeFirst();
        System.out.println("Removed element from the linked list : " + first);
        System.out.println("Size of the linked list after removal: " + dll.getSize());
        System.out.println("First element is : " + dll.first());
        System.out.println("Last element is : " + dll.last());

        last = dll.removeLast();
        System.out.println("Removed element from the linked list : " + last);
        System.out.println("Size of the linked list after removal: " + dll.getSize());
        System.out.println("First element is : " + dll.first());
        System.out.println("Last element is : " + dll.last());
    }
}
