
import java.util.Random;  // Import the Random class

class Q01 {
// 

    public static void main(String[] args) {
// Perek A {START}
        Node head = new Node(7);
        head.setNext(new Node(21)).setNext(new Node(4));
        Node current = head;
        while (current != null) {

            System.out.print(current.getData() + " => ");
            current = current.setNext(head.getNext().getNext());
        }
        System.out.println("Null");
        // Perek A {END}
        // ----------------------------------------
        // Perek B {START}
        Random random = new Random();
        Node n = new Node(random.nextInt(99) + 2);
        for (Node i = 0; i < n; i++) {
            n.setNext(new Node(random.nextInt(99) + 2));

        }

        // Perek B {END}
    }

}
