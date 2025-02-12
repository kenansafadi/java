import java.util.Random;

public class Q04 {
    public static Node<Integer> createRandomChain(int numNodes) {
//It's a Randomize Chain Node Numbers and  from 1 to numNodes.
        Random random = new Random();
        Node<Integer> head = new Node<Integer>(0);
        head.setNext(new Node<>(random.nextInt(99) + 1));
        Node<Integer> current = head;
        while (current != null) {
        Node<Integer> NewNode = head.setNext(new Node<>(random.nextInt(99) + 1));
            current.setNext(NewNode);
            current = NewNode;

            if (0 <= numNodes && numNodes <= 100) {
                System.out.print("New Traverse Linked List Data: " + NewNode.getData() + "\nActual Data: \t" + current.getData() + "~>");
                return NewNode.getNext();
            } else {
                throw new IllegalStateException("Invalid Number of Node Number: " + current.getData());
            }


        }
        return null;
    }

    public static void main(String[] args) {
        Q04 q04 = new Q04();
        Node<Integer> randomChain = q04.createRandomChain(100);
    }
}
