package Sprint2_2;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class B {
    public static int[] mas = new int[1024];

    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("input.txt"), Charset.defaultCharset());
        System.out.println(fibonachiMemory(Integer.parseInt(lines.get(0))));

    }

    public static int fibonachiMemory(int n){
        mas[0] = 1;
        mas[1] = 1;
        if(mas[n] != 0){
//            System.out.println("lol");
            return mas[n];
        } else{
//            System.out.println("lol2");
            int val = fibonachiMemory(n-1) + fibonachiMemory(n-2);
            mas[n] = val;
            return mas[n];
        }
    }
}
