package com.ss.stacks;

/**
 * Created by Siddhesh on 3/13/2017.
 */
public class HTMLValidator {
    public static void main(String args[]) {
        String html = "<html>\n" +
                "  <head>\n" +
                "    <title>Bootstrap 101 Template</title>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "    <h1>Hello, world!</h1>\n" +
                "    <script></script>\n" +
                "  </body>\n" +
                "<html>";
        System.out.print("Is HTML valid ? " + isValid(html));
    }

    static boolean isValid(String html) {
        Stack linkedStack = new LinkedStack();
        int j = html.indexOf('<');
        while (j > -1) {
            int k = html.indexOf('>', j+1);
            if(k==-1)
                return false;
            String tag = html.substring(j + 1, k);
            if (!tag.startsWith("/")) {
                linkedStack.push(tag);
            } else {
                if(linkedStack.isEmpty())
                    return false;
                if(!tag.substring(1).equals(linkedStack.pop())) {
                    return false;
                }
            }
            j = html.indexOf('<', k+1);
        }
        return linkedStack.isEmpty();
    }
}
