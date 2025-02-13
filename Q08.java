//Node ,Generic type
public class Q08 {
    public static void compressSequences(Node<Character> chain) {
        Node<Character> head = chain;
        Node<Character> current = head;
        current = current.getNext();
        if(current.getData()==)
    }

    public static void main(String[] args) {
        Node<Character> head = new Node<>('k');
        head.setNext(new Node<>('k'))
                .setNext(new Node<>('k'))
                .setNext(new Node<>('b')).setNext(new Node<>('b')).setNext(new Node<>('k'))
                .setNext(new Node<>('z')).setNext(new Node<>('e'))
                .setNext(new Node<>('e')).setNext(new Node<>('z'));

        Node<Character> anotherHead = head;
        anotherHead = anotherHead.getNext();
        while (head.getNext() == anotherHead.getNext().getNext()) {

            Node<Character> newNode = head;
            while (newNode.getNext() != anotherHead.getNext()) {
                newNode = newNode.getNext();
            }
        }


    }
}
