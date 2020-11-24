package Sprint2_2;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//            List<String> lines = Files.readAllLines(Paths.get("input.txt"), Charset.defaultCharset());
            System.out.println(fibonachi((in.nextInt())));



    }

    public static int fibonachi(int a){
        if (a==0 || a == 1){
            return 1;
        }
            return fibonachi(a - 1) + fibonachi(a - 2);

    }
}
