package MahatExams;

public class Q01 {

    public static void first(Node<Integer> chain) {
        Node<Integer> head = chain;
        Node<Integer> current = head;
        int cnt=0;
        while(current!=null){
            Node<Integer> newNode = head;
            cnt++;
            newNode.setData(cnt);
            newNode.getNext();
            
        }
    }

    public static void main(String[] args) {

        Node<Integer> head = new Node<>(0);
        head.setNext(new Node<>(10)).setNext(new Node<>(20)).setNext(new Node<>(30)).setNext(new Node<>(40)).setNext(new Node<>(50));
        first(head);
    }
    
}
