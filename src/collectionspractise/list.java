package collectionspractise;
import com.sun.xml.internal.bind.v2.TODO;

import java.util.*;
import java.util.ArrayList;


public class list {

    public static void main(String[] args) {
        product table = new product("table1", 250);
        product chair = new product("chair1", 100);
        product lamp = new product("table1", 50);
        product door = new product("table1", 60);

        List<product> list2=new ArrayList<>();
        list2.add(table);
        list2.add(chair);
        list2.add(lamp);
        list2.add(door);

     Iterator<product> itr=list2.iterator();
     ListIterator<product> itr2=list2.listIterator();

        //TODO
        while(itr2.hasNext()){
            product p=itr2.next();
            if(p.data>90){
                itr2.remove();
            }else{
                System.out.println(p);
            }


        }






    }

}
