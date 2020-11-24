package Sprint1_2;

import java.io.*;
import java.util.*;

public class A {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        Set<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();

        int temp = in.nextInt();

        for (int i = 0; i < temp; i++) {

                String s = in.nextLine();
                if (!set.contains(s)) {
                    list.add(s);
                }
                set.add(s);


        }
        for (String s : list) {
            System.out.println(s);


        }

    }
}
