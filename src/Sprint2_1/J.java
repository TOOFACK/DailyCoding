package Sprint2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = br.readLine();
            String lastWord = s.substring(s.lastIndexOf(" ") + 1);
            System.out.println(lastWord.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
