
class Q01 {
// 

    public static void main(String[] args) {
        // Perek A {START}
        // Node head = new Node(7);
        // head.setNext(new Node(21)).setNext(new Node(4));
        // Node current = head;
        // while (current != null) {
        //     System.out.print(current.getData() + " => ");
        //     current = current.getNext();
        // }
        // System.out.println("Null");
        // Perek A {END}
        // ----------------------------------------
        // Perek B {START}
        // Random random = new Random(); // Create a Random object
        // Node n = new Node(random.nextInt(99) + 2);  // Using Object as a generic type
        // Node head = new Node(1);

        // Node current2 = head;  // Create the current node with the random number from
        // for (int i = 2; i <= n.getData(); i++) {
        //     Node NewNode = new Node(i);
        //     current2.setNext(NewNode);
        //     current2 = NewNode;
        // }
        // System.out.println("Linked List:" + n.getData() + " ~>");
        // current2 = head;
        // while (current2 != null) {
        //     System.out.print(current2.getData() + " ~> ");
        //     current2 = current2.getNext();
        // }
        // System.out.println("Null");
        // Perek B {END}
        // ----------------------------------------
        // Perek C {START}
        Node<String> head = new Node<>("my");
        head.setNext(new Node<>("name")).setNext(new Node<>("is")).setNext(new Node<>("Moshe"));
        Node<String> current = head;
        while (current != null) {
            System.out.print(current.getData() + "~>");
            current = current.getNext();
            if (current == null)
                System.out.println("null");
        }

    }
} // main

//  Q01 class
