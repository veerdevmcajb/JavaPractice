package collections.list.stack;

import java.util.Stack;

public class Prog1 {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.add(20);

        System.out.println(s.get(1));

        s.clear();
        System.out.println(s.peek());// EmptyStackException
    }
}
