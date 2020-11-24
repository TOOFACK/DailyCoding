package Sprint2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class С {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> ans = new ArrayList<>();
        try {
            String line1 = br.readLine();
            String line2 = br.readLine();
            boolean trigger = false;

            if(line1.trim().length() == 0) {
                trigger = true;
            } else{

                String buf = String.valueOf(line1.charAt(0));
                int k = 0;


                for (int i = 0; i < line2.length(); i++) {
                    if (buf.equals(String.valueOf(line2.charAt(i)))) {
//                    System.out.println("Found " + buf);
                        ans.add(buf);
                        k++;
                        if (k == line1.length()) break;
                        buf = String.valueOf(line1.charAt(k));
//                    System.out.println("Now searching for " + buf);
                    }
                }



            }
            if (trigger) {
                System.out.println("True");
            } else if (ans.size() == line1.length()) {
                System.out.println("True");
            } else {
                System.out.println("False");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
