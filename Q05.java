public class Q05 {
    public static void change(Node<Integer> chain1, Node<Integer> chain2) {
        Node<Integer> pos = chain1;
        while (pos.getNext() != null) pos = pos.getNext();
        pos.setNext(chain2);
    }

    public static void main(String[] args) {
        Node<Integer> head1 = new Node<>(1);
        Node<Integer> current1 = head1;
        for (int i = 2; i <= 10; i++) {
            current1.setNext(new Node<>(i));
            current1 = current1.getNext();
            System.out.print("Chain{1}:\t" + current1.getData() + " -> ");
        }
        Node<Integer> head2 = new Node<>(11);
        Node<Integer> current2 = head2;
        for (int i = 12; i <= 20; i++) {
            current2.setNext(new Node<>(i));
            current2 = current2.getNext();
            System.out.println("Chain{2}:\t" + current2.getData() + " -> ");
        }
        change(head1, head2);
        Node<Integer> current = head1;
        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}

