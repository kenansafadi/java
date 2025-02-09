class q01 {

public static void main(String[] args) {
    Node first=new Node(7);
    Node second=new Node(21);
    Node third=new Node(4);

    first.next=second;
    second.next=third;

    Node current=first;
    while(current!=null){
        System.out.print(current.data + " =>");
        current=current.next;
    }
    System.out.println("Null");
}

}