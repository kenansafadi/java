
class q01 {

    public static void main(String[] args) {

        Node head = new Node(7);
        head.setNext(new Node(21)).setNext(new Node(4));
        Node current = head;
        while (current != null) {

            System.out.print(current.getData() + " => ");
            current = current.setNext(head.getNext().getNext());
        }
        System.out.println("Null");
    }

}
