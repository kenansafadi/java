
class Node2<T> {

    T data;
    Node2 next;

    Node2(T data) {
        this.data = data;
        this.next = null;
    }

    public Node2<T> setNext(Node2 next) {
        this.next = next;
        return next;
    }

    public T getData() {
        return this.data;
    }

    public Node2<T> getNext() {
        return this.next;
    }

    public void setData(T data) {
        this.data = data;
    }

}
