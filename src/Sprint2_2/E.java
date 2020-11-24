package Sprint2_2;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class E {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        List<String> lines = Files.readAllLines(Paths.get("input.txt"), Charset.defaultCharset());
        int val = Integer.parseInt(lines.get(0));
//        int val = in.nextInt();
        System.out.println(factorial(val));
    }

    public static int factorial(int val){
        if (val == 0){
            return 1;
        } else return  val * factorial(val-1);
    }
}
