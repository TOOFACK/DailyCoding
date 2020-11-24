package Sprint2_2;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class D {

        public static void main(String[] args) throws IOException {
            Scanner in = new Scanner(System.in);
            List<String> lines = Files.readAllLines(Paths.get("input.txt"), Charset.defaultCharset());
            int val = Integer.parseInt(lines.get(0));
//            int val = in.nextInt();
            int a = 1;
            int b = 1;
            int c = a + b;
            if (val <= 1) {
                System.out.println(1);
            } else {
//        System.out.println(mas[0]);
//        System.out.println(mas[1]);
                for (int i = 2; i <= val; i++) {
                     c = (a + b) % 10;
                     a = b;
                     b = c;
//            System.out.println(mas[i]);
                }
//        System.out.println("lol");
                System.out.println(c);
            }
        }
    }


