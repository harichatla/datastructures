package codingpractise;


import java.io.*;
import java.util.HashMap;

public class CountNoOccurences {
    static int max=0;
    public CountNoOccurences() throws IOException {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        String str=input.readLine();
        HashMap<Character, Integer> hm=new HashMap<>();

        for(int i=0;i<str.length();i++){

            if(hm.containsKey(str.charAt(i))){
               hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
               max=max<hm.get(str.charAt(i))?hm.get(str.charAt(i)):max;
            }
            else {
                hm.put(str.charAt(i),1);
                max=max<1?1:max;
            }
        }


    }

    @Override
    public String toString() {
        return "max is "+max;
    }
}
