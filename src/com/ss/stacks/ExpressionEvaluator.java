package com.ss.stacks;

/**
 * Created by Siddhesh on 3/13/2017.
 */
public class ExpressionEvaluator {

    public static void main(String args[]) {
        Stack operandStack = new LinkedStack();
        Stack operatorStack = new LinkedStack();

        String exp = "((2+5)-(3*6))";
        for (char c : exp.toCharArray()) {
            switch (c)  {
                case '(' :
                    break;
                case '+' :
                case '-' :
                case '*' :
                case '/' :
                    operatorStack.push(c);
                    break;
                case ')': {
                    char operator = (char) operatorStack.pop();
                    int val = (int) operandStack.pop();
                    switch (operator) {
                        case '+' :
                            val = (int) operandStack.pop() + val;
                            break;
                        case '-' :
                            val = (int) operandStack.pop() - val;
                            break;
                        case '*' :
                            val = (int) operandStack.pop() * val;
                            break;
                        case '/' :
                            val = (int) operandStack.pop() / val;
                            break;
                        default:;
                    }
                    operandStack.push(val);
                    break;
                }
                default: {
                    operandStack.push(Character.getNumericValue(c));
                }
            }
        }

        System.out.print("Answer is " + operandStack.pop());
    }
}
