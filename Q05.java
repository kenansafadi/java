public class Q05 {
    public static void change(Node<Integer> chain1, Node<Integer> chain2) {
        Node<Integer> pos = chain1;
        while (pos.getNext() != null) pos = pos.getNext();
        pos.setNext(chain2);
    }

    public static void main(String[] args) {
        Node<Integer> head1 = new Node<>(0);
        head1.setNext(new Node<>(10)).setNext(new Node<>(20)).setNext(new Node<>(30)).setNext(new Node<>(40)).setNext(new Node<>(50));

        Node<Integer> current1 = head1;

        Node<Integer> head2 = new Node<>(55);
        head2.setNext(new Node<>(500)).setNext(new Node<>(600)).setNext(new Node<>(700)).setNext(new Node<>(800)).setNext(new Node<>(900));
        Node<Integer> current2 = head2;

        change(head1, head2);
        Node<Integer> current = head1;

        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}

