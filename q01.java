
import java.util.Random;  // Import the Random class

class Q01 {
// 

    public static void main(String[] args) {

        // Perek A {START}
        // Node head = new Node(7);
        // head.setNext(new Node(21)).setNext(new Node(4));
        // Node current = head;
        // while (current != null) {
        //     System.out.print(current.getData() + " => ");
        //     current = current.getNext();
        // }
        // System.out.println("Null");
        // Perek A {END}
        // ----------------------------------------
        // Perek B {START}
        Random random = new Random(); // Create a Random object
        Node<Integer> n = new Node(random.nextInt(99) + 2); // Get the number of nodes in the list
        Node head2 = new Node(random.nextInt(99) + 2); // Create the head node with the random  number from 2 to 100
        Node current2 = head2;  // Create the current node with the random number from
        Node<Integer> i = new Node(0);
        for (i = 0; i < n; i++) { //  Create the rest of the nodes with random numbers from 2 to 100
            current2.setNext(new Node(random.nextInt(99) + 2)); //  Set the next node to the current node
            current2 = current2.getNext();//  Set the current node to the next node
            System.out.print(n.getData() + "~>");
        }
        // Perek B {END}
    }

}
