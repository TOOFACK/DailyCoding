package Sprint6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class E {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int temp = Integer.parseInt(bf.readLine());
        ArrayList<String> list = new ArrayList<>();
        int index = -1;
        for (int i = 0; i < temp * 2; i++) {
            String line = bf.readLine();
            if (line.matches("[-+]?\\d+")) {
                index++;
                continue;
            }
            list.add(index, line);

        }
        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.toString());


        }
    }
}
