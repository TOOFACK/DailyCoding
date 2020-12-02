package Sprint6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class E {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int temp = Integer.parseInt(bf.readLine());
        ArrayList<ArrayList<String>> list = new ArrayList<>();

        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < temp * 2; i++) {
            String line = bf.readLine();

            ArrayList<String> b = new ArrayList<>(list1);
            if (line.matches("[-+]?\\d+") && i > 0) {

                list.add(b);

                list1.clear();

            } else if (!line.matches("[-+]?\\d+")) {
                list1.addAll(Arrays.asList(line.split(" ")));
            }

            if (i == (temp * 2) - 1) {
                list.add(list1);
            }


        }


        for (ArrayList<String> s : list) {
            Collections.sort(s);
        }
        System.out.println(list.toString());

        StringBuilder ans = new StringBuilder();


        for (int i = 0; i < list.size(); i++) {


        }
    }
}
