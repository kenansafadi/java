

//Node ,Generic type
public class Q08 {
    public static void compressSequences(Node<Character> chain) {
        Node<Character> head = chain;
        Node<Character> current = head;

        while (current.getNext() != null) {
            if (!(current.getData().equals(current.getNext().getData()))) {

                System.out.print("compressing " + current.getData() + "~>\n");
                current = current.getNext();
            }
            current = current.getNext();
        }
        if (current.getData() == null) {
            throw new NullPointerException("Chain is empty");
        }
        current = current.getNext();

    }

    public static void main(String[] args) {
        Node<Character> head = new Node<>('k');
        head.setNext(new Node<>('k')).setNext(new Node<>('k')).setNext(new Node<>('b')).setNext(new Node<>('b')).setNext(new Node<>('k')).setNext(new Node<>('z')).setNext(new Node<>('e')).setNext(new Node<>('e')).setNext(new Node<>('z'));

        compressSequences(head);


    }
}
