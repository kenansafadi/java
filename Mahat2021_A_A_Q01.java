public class Mahat2021_A_A_Q01 {

    public static void first(Node<Integer> chain) {
        Node<Integer> head = chain;
        Node<Integer> current = head;

        int holder;
        while (current != null) {
            Node<Integer> newNode = head;

            if (current.getData() != (current.getNext().getData()) && current.getNext() != null) {
                newNode.setData(current.data);
                newNode.getNext().setData(current.data);
                holder = newNode.getData();
                newNode.getNext().setData(holder);
                System.out.print("Current: " + current.getData() + "~>");
            }
            current = current.getNext();
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node<Integer> head = new Node<>(1);
        head.setNext(new Node<>(2)).setNext(new Node<>(3)).setNext(new Node<>(4));
        first(head);
    }

}
