package com.ss.stacks;

/**
 * Created by Siddhesh on 3/12/2017.
 */
public class Main<E> {
    public static void main(String args[]) {
        /*Stack arrayStack = new ArrayStack();
        arrayStack.push(10);
        arrayStack.push(20);
        arrayStack.push(30);
        arrayStack.push(40);

        System.out.println("Top element in the stack is : " + arrayStack.top());
        arrayStack.pop();
        arrayStack.push(50);
        System.out.println("Top element in the stack is : " + arrayStack.pop());
        System.out.println("Size of the stack is : " + arrayStack.size());*/

        Stack linkedStack = new LinkedStack();
        linkedStack.push(10);
        linkedStack.push(20);
        linkedStack.push(30);
        linkedStack.push(40);

        System.out.println("Top element in the stack is : " + linkedStack.top());
        linkedStack.pop();
        linkedStack.push(50);
        System.out.println("Top element in the stack is : " + linkedStack.pop());
        System.out.println("Size of the stack is : " + linkedStack.size());

    }
}
