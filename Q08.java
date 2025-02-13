//Node ,Generic type
public class Q08 {
    public static void compressSequences(Node<Character> chain) {
        Node<Character> head = chain;
        Node<Character> current = head;
        current = current.getNext();
        while (current.getNext() != null) {
            if (current.getData() == current.getNext().getData()) {
                Node<Character> newNode = current;
                newNode.setData(head.getData());
                current = newNode;
                current = current.getNext();
                System.out.print("compressed " + current.getData() + "~>");
            }
            current = current.getNext();
        }

    }

    public static void main(String[] args) {
        Node<Character> head = new Node<>('k');
        head.setNext(new Node<>('k')).setNext(new Node<>('k')).setNext(new Node<>('b')).setNext(new Node<>('b')).setNext(new Node<>('k')).setNext(new Node<>('z')).setNext(new Node<>('e')).setNext(new Node<>('e')).setNext(new Node<>('z'));

        compressSequences(head);


    }
}
