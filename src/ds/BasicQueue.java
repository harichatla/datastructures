package ds;


public class BasicQueue<X> {
    private X[] data;
    private int rear;
    private int front;

    public BasicQueue(){
        this(1000);

    }

    public BasicQueue(int Size) {
        data=(X[])new Object[Size];
    }
}
