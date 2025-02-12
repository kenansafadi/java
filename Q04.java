import java.util.Random;


public class Q04 {

    public static Node<Integer> createRandomChain(int numNodes) {
        Random random = new Random();
        int nodeValue = random.nextInt(100) + 1; // Random number between 1-100
        Node<Integer> head = new Node<>(nodeValue);
        Node<Integer> current = head;
        if (numNodes <= 0 || numNodes > 100) {
            System.out.println("            Invalid number of nodes:\t ~>" + numNodes);
            return null;
        }
        for (int i = 1; i < numNodes; i++) {  // Start from 1 because head is already created
            nodeValue = random.nextInt(100) + 1;
            Node<Integer> newNode = new Node<>(nodeValue);
            current.next = newNode;  // Link the new node
            current = newNode;  // Move to the new last node
        }
        return head;
    }

    // Function to print the linked list
    public static void printList(Node<Integer> head) {
        Node<Integer> current = head;
        while (current != null) {
            System.out.print(current.getData() + " -> ");  // Print node value
            current = current.getNext();  // Move to the next node
            System.out.println("null");  // End of the list
        }
    }

    public static void main(String[] args) {
        Node<Integer> head = createRandomChain(-1);  // Create a linked list with 10 nodes
        printList(head);  // Print the list
    }
}