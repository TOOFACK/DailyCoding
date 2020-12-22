
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
        String a = in.next();
        String b = in.next();
        String c = in.next();
        String d = in.next();

        System.out.println(a+ " " +  b +  " "  + c + " " +d);


    }



}
