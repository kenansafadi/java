
package Exam_Questions;

import java.util.Stack;
public class Q {
    public static void split_stack(Stack<Integer> s) {
        Stack<Integer> temps = new Stack<Integer>();
        Stack<Integer> t1 = new Stack<Integer>();
        int cnt = 0;

        while (!s.isEmpty()) {
            if (cnt != 3) {
                temps.push(s.pop());
                cnt++;
                t1.push(temps.pop());
            }
            while (!temps.isEmpty() && cnt == 3) {
                temps.pop();
            }
            cnt = 0;
            while (temps.isEmpty() && cnt == 0) {
                temps.push(s.pop());
                t1.push(temps.pop());
                cnt++;
                System.out.println("T1 ~> "+t1);
            }
        }
            
    }
public static void main(String[] args) {
    Stack<Integer> s = new Stack<Integer>();
    // insert 23,5,67,45,24,37,12
    s.push(23);
    s.push(5);
    s.push(67);
    s.push(45);
    s.push(24);
    s.push(37);
    s.push(12);

    split_stack(s);
   
}
    
}
/*
 * 
 * t1= [12,37]
 * t1=[12,37,25,45]
 * t1=[12,37,25,45,67,5]
 */