

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


    }
}
