import java.util.Random;

public class Q04 {
    public static Node<Integer> createRandomChain(int numNodes) {
//It's a Randomize Chain Node Numbers and  from 1 to numNodes.
        Random random = new Random();
        Node<Object> head = new Node<Object>(0);
        head.setNext(new Node<>(random.nextInt(99) + 1));
        Node<Object> current = head;
        while (current != null) {
            Node<Object> NewNode = new Node<Object>(current.getNext());
            current.setNext(NewNode);
            current = NewNode;
            if (0 <= numNodes && numNodes <= 100) {
                System.out.print("New Traverse Linked List Data" + NewNode.getData() + "Actual Data: \t" + current.getData() + "~>");

            } else {
                throw new IllegalStateException("Invalid Number of Node Number: " + current.getData());
            }

        }
    }
}
