import java.util.*;

public class main {

    public static void avgTopDown(Stack<Integer> s) {

        Stack<Integer> temps = new Stack<>();
        int sum = 0, count = 0;
        double avg;
        Stack<Integer> heights = new Stack<>();


        while (!s.isEmpty()) {
            count++;
            temps.push(s.pop());
            sum += temps.top();
        }
        avg = (double) sum / count;
        while (!temps.isEmpty()) {
            if (temps.top() <= avg) {
                s.push(temps.pop());
            } else {
                heights.push(temps.pop());
            }

        }
        while (!heights.isEmpty()) {
            s.push(heights.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(10);
        s.push(15);
        s.push(20);
        s.push(25);
        s.push(30);
        s.push(35);
        s.push(40);
        System.out.println("Original Stack: " + s);
        avgTopDown(s);
        System.out.println("Stack after sorting: " + s);
        System.out.println("Average of the top half: " + (double) s.stream().limit(s.size() / 2).mapToInt(Integer::intValue).sum() / s.size() / 2);
        System.out.println("Average of the bottom half: " + (double) s.stream().skip(s.size() / 2).mapToInt(Integer::intValue).sum() / s.size() / 2);

    }
}
