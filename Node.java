
class Node<T> {

    T data;
    Node next;


    Node(T data) {
        this.data = data;
        this.next = null;
    }
// 

    public Node setNext(Node next) {
        this.next = next;
        return next;
    }

    public T getData() {
        return this.data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setData(T data) {
        this.data = data;
    }
}
