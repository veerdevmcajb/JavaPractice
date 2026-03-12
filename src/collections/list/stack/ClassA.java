package collections.list.stack;

import java.util.Stack;

// insertion order is not maintained .
// duplicates are allowed.
// default capacity is 10;
// incremental capacity is double
// null is allowed
// stack is LIFO

public class ClassA {

    public static void main(String[] args) {
        Stack s=new Stack();
        System.out.println(s.capacity());
        System.out.println(s.size());

        s.add(10);
        s.add(20);

        System.out.println(s);

        s.push(40);
        s.push(30);
        s.push(50);
        s.push(10);
        s.push(60);
        s.push(70);
        s.push(80);
        s.push(90);
        s.push(null);

        System.out.println(s.get(5));

        System.out.println("Capacity is " + s.capacity());
        System.out.println(s);

        System.out.println(s.pop()); // return & remove a last element
        System.out.println(s);

        System.out.println(s.peek()); // return the last element but not remove .
        System.out.println(s);

    }
}
