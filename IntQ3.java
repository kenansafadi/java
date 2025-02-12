public class IntQ3<T> {
    T data;
    IntQ3 next;

    public IntQ3(T data) {
        this.data = data;
        this.next = null;
    }

    public IntQ3 setNext(IntQ3 next) {
        this.next = next;
        return next;
    }

    public IntQ3 getNext() {
        return this.next;
    }

    public T getData() {
        return this.data;
    }

    public T setData(T data) {
        this.data = data;
        return data;
    }

    public IntQ3(IntQ3<T> Other) {
        if (Other == null) {
            throw new IllegalArgumentException("Cannot copy a null object");
        }
        this.data = Other.data;
        this.next = (Other.next != null) ? new IntQ3<>(Other.next) : null;
    }

    public static void main(String[] args) {
        IntQ3<Integer> q1 = new IntQ3<>(1);
        IntQ3<Integer> q2 = new IntQ3<>(2);
        IntQ3<Integer> q3 = new IntQ3<>(3);

        IntQ3<Integer> copy = new IntQ3<>(q1).setNext(q2).setNext(q3);
        q1.setNext(q2).setNext(q3);
        IntQ3<Integer> current = q1;
        IntQ3<Integer> currentCopy = q1;
        while (current != null) {
            if (current != null) {

                System.out.print(current.getData() + " ~> ");


                System.out.print(currentCopy.getData() + " ~> ");
                current = current.getNext();
                System.out.print("\n");
            }
        }
        System.out.print("Null");

        System.out.println("Original Queue: " + q1.getData());
        System.out.println("Copied Queue: " + copy.getData());
    }
}
