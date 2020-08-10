package ds;

public class BasicStack<X> {
    private int StackPointer;
    private X[] data;

    public BasicStack(){
        this(1000);
    }

    public BasicStack(int Size){
        data=(X[]) new Object[Size];
        StackPointer=0;

    }

    public void push(X Item){
        data[StackPointer++]=Item;
    }

    public X pop(){
        X Item=data[--StackPointer];
        return Item;
    }

    public boolean contains(X Item){
        int i;
        boolean found=false;
        for(i=0;i<StackPointer;i++){
            if(data[i].equals(Item)){
                found=true;
                break;
            }
        }
        return found;
    }

    public int access(X Item){
        while(StackPointer>0){
            X tmpItem=pop();
            if(Item.equals(tmpItem)){
                return StackPointer;
            }
        }
        throw new IllegalArgumentException("could not found item on the stack :"+Item);
    }
    public int size(){
        return StackPointer;
    }

}
