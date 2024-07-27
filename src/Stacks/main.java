package Stacks;

import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Stack<String>stack=new Stack<>();
        stack.add("hello");
        stack.add("world");
        System.out.println(stack.peek());
    }
}
