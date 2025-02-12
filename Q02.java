
class Q02 {

    public static void main(String[] args) {

        Node<Object> head = new Node(30);
        head.setNext(new Node<>("Hello")).setNext(new Node<>(5)).setNext(new Node<>(4));

        Node<Object> current = head;

        while (current != null) {
            System.out.print(current.getData() + "~>");
            current = current.getNext();
        }
        System.out.println("null");

    }
}
