

//Node ,Generic type
public class Q08 {
    public static void compressSequences(Node<Character> chain) {
        Node<Character> head = chain;
        
        Node<Character> current = head;
        while (current.getNext() != null) {
            Node<Character> newNode = head;
            if (!(current.getData().equals(current.getNext().getData()))) {
                newNode.setData(current.getData());
                System.out.print("compressing " + newNode.getData() + "~>\n");
            }
            current = current.getNext();
        }
        
        

    }

    public static void main(String[] args) {
        Node<Character> head = new Node<>('k');
        head.setNext(new Node<>('k')).setNext(new Node<>('k')).setNext(new Node<>('b')).setNext(new Node<>('b')).setNext(new Node<>('k')).setNext(new Node<>('z')).setNext(new Node<>('e')).setNext(new Node<>('e')).setNext(new Node<>('z'));

        compressSequences(head);
/*
 * <START>
 * Explain what the program does:
 *  The program compresses the sequences of the same character in a linked list.
 * The program uses a while loop to iterate through the linked list and compares the current node with the next node.
 * If the current node's data is not equal to the next node's data, a new node is created and the current node's data is assigned to the new node's data.
 * The current node is then moved to the next node.
 * <END>
 */

    }
}
