package collectionspractise;

public class product {
    public int data;
    public String value;


    public product(String value,int data){
        this.data=data;
        this.value=value;
    }

    public int getData() {
        return data;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "product{" +
                "data=" + data +
                ", value='" + value + '\'' +
                '}';
    }
}
