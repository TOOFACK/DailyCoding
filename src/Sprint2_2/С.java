package Sprint2_2;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class С {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        List<String> lines = Files.readAllLines(Paths.get("input.txt"), Charset.defaultCharset());
        int[] mas = new int[1024];
        int val = Integer.parseInt(lines.get(0));
//        int val = in.nextInt();

        mas[0] = 1;
        mas[1] =1;
//        System.out.println(mas[0]);
//        System.out.println(mas[1]);
        for(int i = 2; i <= val; i++){
            mas[i] = mas[i-1] + mas[i-2];
//            System.out.println(mas[i]);
        }
//        System.out.println("lol");
        System.out.println(mas[val]);
    }
}
