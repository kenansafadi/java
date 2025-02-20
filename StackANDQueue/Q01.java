package StackANDQueue;

import java.util.Stack;

public class Q01 {
    public static void main(String[] args) {
        Stack<Character> s1 = new Stack<Character>();
        Stack<Character> s2 = new Stack<Character>();
        s1.push('a');
        s1.push('b');
        s1.push('c');
        s1.push('d');
        char ch = s1.pop();
        s2.push(ch);
        ch = s2.pop();
        s1.push('e');
        System.out.println(s1);
        System.out.println(s2);
    }
}