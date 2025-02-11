
class Q02 {

    public static  void main(String[] args) {

        Node2<Object> head = new Node2<>(30);  // Using Object as a generic type
        head.setNext(new Node2<>("Hello")) // Adding a String
                .setNext(new Node2<>(5)) // Adding an Integer
                .setNext(new Node2<>(4));         // Adding another Integer

        Node2<Object> current = head;
        while (current != null) {
            System.out.print(current.getData() + "~>");
            current = current.getNext();
            if (current == null) {

                System.out.println("null");
            }
        }
    }
}
