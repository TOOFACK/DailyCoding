package Sprint2_2;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class F {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        List<String> lines = Files.readAllLines(Paths.get("input.txt"), Charset.defaultCharset());

        BigInteger val = BigInteger.valueOf(Integer.parseInt(lines.get(0)));
//        BigInteger val = BigInteger.valueOf(in.nextInt());
        BigInteger sum = BigInteger.valueOf(1);

        while(!(val.equals(BigInteger.valueOf(0)))){
            sum = sum.multiply(val);
            val = val.subtract(BigInteger.valueOf(1));
//            System.out.println("val :" + val);
//            System.out.println("sum:" +  sum);

        }
        System.out.println(sum);
    }
}
