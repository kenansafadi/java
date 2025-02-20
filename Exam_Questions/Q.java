package Exam_Questions;

import java.util.Stack;

public class Q {
    public static void split_stack(Stack<Integer> s) {
        Stack<Integer> temps = new Stack<>();
        Stack<Integer> newTemps = new Stack<>();

        int mid = s.size() / 2;

        // Step 1: Pop elements from s and split them
        for (int i = 0; i <= mid; i++) {
            temps.push(s.pop()); // First half goes to temps
        }

        while (!s.isEmpty()) {
            newTemps.push(s.pop()); // Remaining elements go to newTemps
        }

        // Step 2: Rebuild the stack in the desired order
        while (!temps.isEmpty()) {
            s.push(temps.pop()); // Push elements from temps first
        }
        while (!newTemps.isEmpty()) {
            s.push(newTemps.pop()); // Then push elements from newTemps
        }

        System.out.println("Final Stack: " + s);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        // input: 23, 5, 67, 45, 25, 37, 12
        s.push(23);
        s.push(5);
        s.push(67);
        s.push(45);
        s.push(25);
        s.push(37);
        s.push(12);

        System.out.println("Original Stack: " + s);
        split_stack(s);
    }
}
