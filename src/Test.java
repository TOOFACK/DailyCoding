
import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashtable = new HashMap<>();

        hashtable.put(1,1);
        hashtable.put(2,2);
        hashtable.put(1,2);
        System.out.println(hashtable.entrySet());
        System.out.println(hashtable.containsValue(2));
        Scanner in = new Scanner(System.in);


//        System.out.println(a+ " " +  b +  " "  + c + " " +d);

        int h = 0;
        h+= 101%10;
        System.out.println(h);
        System.out.println("hi");
    }

    



}
